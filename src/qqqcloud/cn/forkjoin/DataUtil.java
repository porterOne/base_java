package qqqcloud.cn.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 数据源 工具类
 * tjx
 */
public class DataUtil {


    /**
     * 模拟 获取数据库
     * @return
     */
    public static List<Student> getDbData(){
        List<Student> result = new ArrayList<Student>();
        Random random = new Random();
        for (int i = 0; i <100000 ; i++) {
            Student student = new Student();
            student.setUsername(random.nextInt(99)+"");
            result.add(student);
        }
        return result;
    }


    /**
     * 模拟 获取excel数据
     * @return
     */
    public static List<Student> getExcelData(){
        List<Student> result = new ArrayList<Student>();
        Random random = new Random();
        for (int i = 0; i <10000 ; i++) {
            Student student = new Student();
            student.setUsername(random.nextInt(100000)+"");
            result.add(student);
        }
        return result;
    }


}