import java.util.Scanner;

public class Tugas6_12 {
    public static void main(String[] args) {
        int a = 0, i = 1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        while(true) {
            while(true) {
                try {
                    System.out.printf("Masukkan Input " + i + " : ");
                    Scanner scnA = new Scanner(System.in);
                    a += scnA.nextInt();
                    if(a > max) max = a;
                    if(a < min) min = a;
                    i++;
                    break;
                } catch (Exception e) {
                    System.out.println("\nInput harus berformat nomor!\n");
                }
            }
            System.out.printf("Mau memasukkan data lagi [y/t] ? ");
            Scanner scnC = new Scanner(System.in);
            String confirm = scnC.next();
            if(confirm.equals("t")) break;
        }       
        System.out.println("Total Bilangan : " + a);
        System.out.println("Rata-Rata : " + (double)a/(double)i);
        System.out.println("Nilai Maximum : " + max);
        System.out.println("Nilai Minimum : " + min);
    }
}