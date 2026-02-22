import java.util.*;
public class Arrays {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static int largest_smallest_number(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest=numbers[i];
            }

            if(smallest> numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        //for linear searrch
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key =20;

        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("Key not found");
        // }
        // else{
        //     System.out.println("Key is at index "+ index);
        // }

        //largest in array
        int numbers[] = {5, 7, 11, 8, 45, 70, 76, 58, 48, 44};
        System.out.println("Largest value is "+ largest_smallest_number(numbers));
    }
}
