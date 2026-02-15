public class Patterns {
    public static void holRect(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
             }
             System.out.println();
        }

    }

    public static void inverted_totated_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                //print spaces
                System.out.print(" ");
            }
            //print stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_withNumbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        //holRect(10, 10);
        //inverted_totated_half_pyramid(10);
        //inverted_half_pyramid_withNumbers(6);
        floyds_triangle(7);
    }
}
