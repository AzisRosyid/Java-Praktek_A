import java.util.Scanner;

public class Tugas6_13 {
    public static void main(String[] args) {
        String a; int spc = 0;
        while(true) {
            try {
                System.out.printf("Masukkan Input : ");
                Scanner scnA = new Scanner(System.in);
                a = scnA.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("\nInput harus berformat nomor!\n");
            }
        }

        for(char i: a.toCharArray()) if(i == ' ') ++spc;
        System.out.println("Jumlah Karakter : " + a.length());
        System.out.println("Jumlah Spasi : " + spc);
    }
}
