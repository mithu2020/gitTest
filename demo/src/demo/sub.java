package demo;

public class sub {

    public static void main(String[] args) {
        System.out.println("Sub Branch. new!!!");
        System.out.println("Master Branch.");        
        Console.log("Hello DelftStack");
        Console.log("Hello DelftStack222");
        
    }


    static class Console{
        public static void log(Object obj) {
            System.out.println(obj);
        }
    }
}
