package qqqcloud.cn.forkjoin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

/**
 * 学生操作service
 * tjx
 */
public class StudentService {


    /**
     * 批量导入学生
     */
    public void importStudent(List<Student> dbData, List<Student> excelData){

        // excel自身去重
        excelData = excelData.stream()
                .filter(ArrayListUtil.distinctByKey(Student::getUsername)) //根据username 去重
                .collect(Collectors.toList());
        //不重复数据
        List<Student> repetitionData = new ArrayList<>();
        long s = System.currentTimeMillis();
        //遍历所以excel数据
        for (Student data : excelData) {
            String username = data.getUsername();
            //判断是否存在于 dbData中
            if (!ArrayListUtil.isInclude(dbData, username)) {
                //如果不存在则添加到不重复集合中
                repetitionData.add(data);
            }
        }

        long e = System.currentTimeMillis();
        System.out.println("筛选耗时:"+(e-s)+"ms");
        //在数据库不重复的数据里面 筛选出不重复数据
        repetitionData =repetitionData.stream()
                .sorted(Comparator.comparing(Student::getUsername))//根据username 排序
                .collect(Collectors.toList());

//        repetitionData.forEach(p-> System.out.println(p.getUsername()));

    }


    /**
     * 批量导入学生
     */
    public void importStudent2(List<Student> dbData,List<Student> excelData){
        // 自身去重
        excelData = excelData.stream()
                .filter(ArrayListUtil.distinctByKey(Student::getUsername)) //根据username 去重
                .collect(Collectors.toList());

        long s = System.currentTimeMillis();
        //获取不重复数据
        ForkJoinPool fjp = new ForkJoinPool();
        DistinctTask task  = new DistinctTask(0,excelData.size(),dbData,excelData);
        List<Student> repetitionData = fjp.invoke(task);
        long e = System.currentTimeMillis();
        System.out.println("筛选耗时:"+(e-s)+"ms");
        //在数据库不重复的数据里面 筛选出不重复数据
        repetitionData =repetitionData.stream()
                .sorted(Comparator.comparing(Student::getUsername))//根据username 排序
                .collect(Collectors.toList());
//        repetitionData.forEach(p-> System.out.println(p.getUsername()));
    }
    public static void main(String[] args) {
        // 模拟获取数据库
        List<Student> dbData = DataUtil.getDbData();

        // 模拟获取excel数据
        List<Student> excelData = DataUtil.getExcelData();
        new StudentService().importStudent(dbData,excelData);
        new StudentService().importStudent2(dbData,excelData);
    }
}