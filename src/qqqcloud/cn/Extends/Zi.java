package qqqcloud.cn.Extends;

public class Zi extends Fu{

    public Zi(){
        this(10);
        System.out.println("zi");
    }
    public Zi(int number){
        super();
    }

  public void getPer()
  {
      System.out.println("子类对象中per："+this.per);
      System.out.println("super中per："+super.per);

  }
}
