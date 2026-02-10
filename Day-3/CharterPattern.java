public class CharterPattern {
    public static void main(String[] args) {
        char ch = 'A';
        for(int line = 1; line <= 5; line++) {
            for(int star = 1; star <= line; star++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    
}
