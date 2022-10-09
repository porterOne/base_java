package qqqcloud.cn.hkStream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class hacker_01_stream {

    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<People>();
        peopleList.add(new People("小明",23,new BigDecimal("3000"),new BigDecimal("1.1")));
        peopleList.add(new People("小红",24,new BigDecimal("2800"),new BigDecimal("1.2")));
        peopleList.add(new People("小兰",22,new BigDecimal("3200"),new BigDecimal("1.3")));
        //统计年龄总和
        int totalAge =peopleList.stream().mapToInt(People::getAge).sum();
        System.out.println("value:"+totalAge);
        System.out.println("------------------------------------------------");
        //统计工资总和
        BigDecimal totalSalary = peopleList.stream()
                .map(People::getSalary)
                .reduce(BigDecimal.ZERO,BigDecimal::add);
        System.out.println("value:"+totalSalary);
        //统计工资乘以各自系数的总和(向上保留两位)
        BigDecimal totalRatioSalary = peopleList.stream()
                .map(s->s.getSalary().multiply(s.getRatio()).setScale(2,BigDecimal.ROUND_HALF_UP))
                .reduce(BigDecimal.ZERO,BigDecimal::add);
        System.out.println("value:"+totalRatioSalary);
    }

}


class People {
    //姓名
    private String name;
    //年龄
    private Integer age;
    //工资
    private BigDecimal salary;
    //比率
    private BigDecimal ratio;

    public People(String name, Integer age, BigDecimal salary, BigDecimal ratio) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.ratio = ratio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }
}
