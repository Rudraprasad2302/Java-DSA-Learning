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

    public static int binarySearch(int numbers[], int key){
        int start=0, end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return -1;

    }

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr +"," +numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " +tp);
    }

    public static void printSubArrays(int numbers[]){
        int ts=0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays:"+ts);
    }
    public static void main(String[] args) {
        
         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
         //int key =20;
         //for linear searrch
        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("Key not found");
        // }
        // else{
        //     System.out.println("Key is at index "+ index);
        // }

        //largest in array
        // int numbers[] = {5, 7, 11, 8, 45, 70, 76, 58, 48, 44};
        // System.out.println("Largest value is "+ largest_smallest_number(numbers));

        //binary search
        //System.out.println("index for key is "+binarySearch(numbers, key));

        //Reverse of an array
        // reverse(numbers);
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();

        //Print Array in pairs
        //printPairs(numbers);

        //print sub arrays
        printSubArrays(numbers);
    }
}
