import java.util.Scanner;

public class Tugas6_9 {
    public static void main(String[] args) {
        int a;
        while(true) {
            try {
                System.out.printf("Masukkan Input : ");
                Scanner scnA = new Scanner(System.in);
                a = scnA.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nInput harus berformat nomor!\n");
            }
        }

        int output = 1;
        for(int i = 1; i <= a; i++) {
            System.out.print(i);
            if (i < a) System.out.print("*");
            output *= i;
        }
        System.out.println("\nOutput : " + output);
    }
}
