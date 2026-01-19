import java.util.*;
public class Solution {
    public static void main(String[] args) {
        double temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        temp = sc.nextDouble();
        if(temp > 100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You don't have fever");
    }
}}
