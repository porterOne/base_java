package qqqcloud.cn.forkjoin;

public class Student {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return (username.equals(student.username));
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        Student student = (Student) this;
        return student.username.hashCode();
    }
}