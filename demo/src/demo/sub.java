package demo;

public class sub {

    public static void main(String[] args) {
        System.out.println("Sub Branch. new!!!");
        System.out.println("Master Branch.");
        System.out.println("Master Branch 22222.");
        Console.log("Hello DelftStack");
        
    }


    static class Console{
        public static void log(Object obj) {
            System.out.println(obj);
        }
    }
}
