import java.util.*;
public class Average {
    public static int average(int x,int y,int z){
return (x + y + z)/3;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int x = sc.nextInt();
    System.out.println("Enter the second number: ");
    int y = sc.nextInt();
    System.out.println("Enter the third number: ");
    int z = sc.nextInt();
    System.out.println("The average value is "+average(x, y, z));
}    
}
