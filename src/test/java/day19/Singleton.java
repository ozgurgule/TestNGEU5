package day19;

public class Singleton {
    private Singleton(){};
    private static String str;
    public static String getInstance(){
        if(str==null){
            System.out.println("str is null. assigning value it");
            str="somevalue";

        }else {
            System.out.println("it has value, just returning it");
        }
        return str;

    }
}
