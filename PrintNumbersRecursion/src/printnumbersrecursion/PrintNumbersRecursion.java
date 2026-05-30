
package printnumbersrecursion;


public class PrintNumbersRecursion {

    
    public static void main(String[] args) {
        print1(1);
    }// end of main
    
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    
    static void print2(int n){
        System.out.println(n);
    }
    
}// end of class
