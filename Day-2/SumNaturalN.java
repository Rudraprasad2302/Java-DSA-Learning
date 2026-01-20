import java.util.Scanner;
public class SumNaturalN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while(num <= n) {
            sum = sum + num;
            num++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
