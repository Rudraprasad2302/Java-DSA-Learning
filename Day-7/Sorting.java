import java.util.Arrays;
public class Sorting {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            int swap=0;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                } 
            }
            System.out.println("Swaps in turn " + (turn + 1) + ": " + swap);
            
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

   public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            boolean swapped = false; // Added to track if a new minimum was found

            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                    swapped = true; // Minimum position has changed
                }
            }
            
            // Optimization: Only swap if a smaller element was found
            if(swapped) {
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
                System.out.println("Swapped element at index " + i + " with index " + minPos);
            } else {
                System.out.println("Index " + i + " is already in the correct position.");
            }
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out correct pos to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] =new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j =0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        bubbleSort(arr);
        //printArr(arr);
        selectionSort(arr);
        //printArr(arr);
        insertionSort(arr);
        //printArr(arr);
        Arrays.sort(arr, 0, 3);
        //printArr(arr);
        countingSort(arr);
        printArr(arr);
    }
    
}
