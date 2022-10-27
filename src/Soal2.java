import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        System.out.println("=========================================");
		System.out.println("PROGRAM NAMA");
		System.out.println("=========================================");

        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = scn.nextLine();

        int lebar = nama.length();
        for(int i = 0; i < lebar / 2; i++) {
            
        }
        System.out.println("Jumlah Karakter : " + nama.length() + "\n");
    }
}
