package qqqcloud.cn.MethodCall;

public class hacker_01_CallbackDemo {

    public static void main(String[] args) {

        StudentImp stu = new StudentImp("王同学");
        TeacherImp teacher = new TeacherImp("李老师");

        teacher.askquestion(stu);

    }

}

class TeacherImp implements Teacher{

    private String name;

    public TeacherImp(String name) {
        this.name = name;
    }

    @Override
    public void askquestion(StudentImp student) {
        System.out.println("我是"+this.name+"要提问问题");
        // 调用学生思考问题方法
        student.think(this,student);
    }

    // 回调方法
    @Override
    public void callback(StudentImp student) {
        System.out.println(student.getName()+"认为太简单了");
    }

}

class StudentImp implements Student{
    private String name;

    public StudentImp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void think(Teacher teacher,StudentImp student) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 回调老师方法
        teacher.callback(student);
    }
}
