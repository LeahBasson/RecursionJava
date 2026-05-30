package methodcalling;

public class MethodCalling {

    public static void main(String[] args) {
        message();
        System.out.println("main method complete");

    }// end of main

    public static void message() {
        System.out.println("this is message");
        message1();
        System.out.println("message method complete");
    }
    
    public static void message1(){
        System.out.println("this is message 1");
    }

}// end of class
