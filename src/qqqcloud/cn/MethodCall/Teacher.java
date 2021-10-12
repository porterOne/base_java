package qqqcloud.cn.MethodCall;

public interface Teacher {

    // 提问问题
    public abstract void askquestion(StudentImp student);
    // 学生反馈问题
    public abstract void callback(StudentImp student);
}
