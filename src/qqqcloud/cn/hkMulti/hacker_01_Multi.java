package qqqcloud.cn.hkMulti;

public class hacker_01_Multi {

    /**
     * 利用泛型实现，参数不限制
     * @param t
     * @param <T>
     */
    public static <T> void getPat(T t){
        if (t instanceof String) System.out.println("String");
        else if( t instanceof Integer) System.out.println("Integer");
        else System.out.println("暂未使用");
    }

    /**
     * 利用多态的向上转型，向下转型，实现参数不限制
     * @param animal
     */
    public static void getPat2(Animal animal){

        if (animal instanceof Dog) ((Dog) animal).watchHourse();
        else if(animal instanceof Cat) ((Cat) animal).catchMouse();
        else{
            System.out.println("暂未使用");
        }
    }

    public static void main(String[] args) {

        getPat("1");
        getPat(1);
        getPat(2.0);

        getPat2(new Dog());
        getPat2(new Cat());
    }
}
