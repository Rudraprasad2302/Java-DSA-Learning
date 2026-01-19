import java.util.*;
public class Marks {
  public static void main(String[] args) {
    int marks;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks:");
    marks = sc.nextInt();
    if(marks >= 35) {
      System.out.println("You have passed.");
    } else {
      System.out.println("You have failed.");
    }
  }  
}
