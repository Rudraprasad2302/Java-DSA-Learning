import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        while(n > 0){
           int lastdigit = n % 10;
           System.out.print(lastdigit);
           n = n/10;
        }
        System.out.println();
    }
}
