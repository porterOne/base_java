package qqqcloud.cn.hkFactory;

public class hacker_01_Factory {

    public static Car getCar(String type){
        Car car=null;
        if("BenChi".equals(type)){
            car=BenChi.getInstance();
        }else if("BaoMa".equals(type)){
            car=BaoMa.getInstance();
        }else if("AoDi".equals(type)){
            car=AoDi.getInstance();
        }
        return car;
    }

    public static class AoDi implements Car{
        public static class AoDiHolder{
            public final static AoDi INSTANCE=new AoDi();
        }
        public static AoDi getInstance(){
            return AoDiHolder.INSTANCE;
        }
        @Override
        public void drive() {
            System.out.println("AoDi");
        }
    }

    public static class BaoMa implements Car{
        public static class BaoMaHolder{
            public final static BaoMa INSTANCE=new BaoMa();
        }
        public static BaoMa getInstance(){
            return BaoMaHolder.INSTANCE;
        }
        @Override
        public void drive() {
            System.out.println("BaoMa");
        }


    }

    public static class BenChi implements Car{
        public static class BenChiHolder{
            public final static BenChi INSTANCE=new BenChi();
        }
        public static BenChi getInstance(){
            return BenChiHolder.INSTANCE;
        }
        @Override
        public void drive() {
            System.out.println("BenChi");
        }

    }

}
