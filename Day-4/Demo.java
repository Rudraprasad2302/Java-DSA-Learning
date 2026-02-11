import java.util.*;
public class Demo {

    public static void printHelloWorld(){
        for(int i=1; i<=5; i++){
            System.out.println("Hello World");
        }
    }

    public static void calculatesum(int a, int b){ // parameters of formal parameters
        
        int sum = a+b;
        System.out.println("Sum is " + sum);
    }

    public static int product(int a, int b){
        int prod = a * b;
        return prod;

    }
    public static void main(String[] args) {
       // printHelloWorld();
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       //calculatesum(a,b); //arguments or actual parameters
       System.out.println(product(a,b));
        
    }
    
}
