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
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        //bubbleSort(arr);
        //printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
    
}
