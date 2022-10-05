public class Tugas6_1 {
    public static void main(String[] args) {
        int size = 6;
        for(int i = 0; i < size; i++){
            for(int j = size - 1; j >= i; j--) {
                System.out.printf(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}