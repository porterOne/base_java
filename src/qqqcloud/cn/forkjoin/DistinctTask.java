package qqqcloud.cn.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class DistinctTask extends RecursiveTask<List<Student>> {

    //单个任务处理数据
    private static final int THRESHOLD_NUM = 100;
    //下标
    private int start, end;

    //需要处理的数据
    private List<Student> dbData;
    private List<Student> excelData;

    public DistinctTask(int start, int end, List<Student> dbData, List<Student> excelData) {
        this.start = start;
        this.end = end;
        this.dbData = dbData;
        this.excelData = excelData;
    }

    @Override
    protected List<Student> compute() {
        //获取当前下标下的数据
        List<Student> newData=excelData.subList(start,end);
        //获取需要计算的数据量
        int size = newData.size();
        if(size<=THRESHOLD_NUM){
            //计算
            List<Student> repetitionData = new ArrayList<>();
            //遍历所以excel数据
            for (Student data : newData) {
                String username = data.getUsername();
                //判断是否存在于 dbData中
                if (!ArrayListUtil.isInclude(dbData, username)) {
                    //如果不存在则添加到不重复集合中
                    repetitionData.add(data);
                }
            }
            return repetitionData;
        }else{
            //拆分
            int middle = (start + end) / 2;
            DistinctTask left = new DistinctTask(start,middle,dbData,excelData);
            DistinctTask right = new DistinctTask(middle+1,end,dbData,excelData);
            //执行子任务
            left.fork();
            right.fork();
            //获取子任务结果
            //join() 方法会阻塞到结果算出来
            List<Student> lResult = left.join();
            List<Student> rResult = right.join();
            //何并结果
            lResult.addAll(rResult);
            return lResult;
        }
    }
}