import java.util.Scanner;

public class Soal1_1 {
    public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("PROGRAM MENGHITUNG :\nY = X^n / (1 x 2 x .... x n)");
		System.out.println("=========================================");
    
        Scanner scn = new Scanner(System.in);
        double Y = 1; 
        String hasil = "Y = ";
        System.out.print("Masukkan Nilai X : ");
        int X = scn.nextInt();
        System.out.print("Masukkan Nilai n : ");
        int n = scn.nextInt();
        hasil += X + "^" + n + " / (";
        int i = 1;
        double bagi = 1;
        do {
            bagi *= i;
            hasil += i;
            if (i < n) hasil += " x ";
            i++;
        } while(i <= n);
        hasil += ") = ";
        i = n;
        do {
            Y *= X;
            i--;
        } while(i > 0);
        hasil += (long)Y + " / " + (long)bagi + " = " + (Y/bagi);
        System.out.println("\nHasil : \n" + hasil);
    }
}
