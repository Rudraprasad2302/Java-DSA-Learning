import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b)
            System.out.println("Largest number is: " + a);
        else
            System.out.println("Largest number is: " + b);
    }
}
