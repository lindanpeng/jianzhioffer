package problem_02;

public class Singleton {
    private Singleton(){

    }
    public static Singleton getInstance(){
        return Inner.singleton;
    }
    private static class Inner{
        private static Singleton singleton=new Singleton();

    }

    public static void main(String[] args) {

    }
}
