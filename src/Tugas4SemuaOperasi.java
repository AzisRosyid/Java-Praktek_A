import java.util.Scanner;

public class Tugas4SemuaOperasi {
    public static void main(String[] args) {
        // Input Data
        int a;
        int b;
        while(true) {
            try {
                System.out.printf("Masukkan Nilai a : ");
                Scanner scnA = new Scanner(System.in);
                a = scnA.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nNilai a harus berformat nomor!\n");
            }
        }
        while(true) {
            try {
                System.out.printf("Masukkan Nilai b : ");
                Scanner scnB = new Scanner(System.in);
                b = scnB.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nNilai b harus berformat nomor!\n");
            }
        }

        // Proses
        // Aritmatika
        int c = a + b;
        int d = a - b;
        int e = a / b;
        double f = (double) a / b;
        int g = a * b;
        int h = a % b;
        // Unary Increment Decrement
        int i = ++a;
        int j = ++b;
        int k = a++;
        int l = b++;
        int m = --a;
        int n = --b;
        int o = a--;
        int p = b--;
        // Perbandingan
        boolean q = a > b;
        boolean r = a >= b;
        boolean s = a < b;
        boolean t = a <= b;
        boolean u = a == b;
        boolean v = a != b;
        // Bitwise
        int w = a & b;
        int x = a | b;
        int y = a ^ b;
        int z = ~a;
        int a1 = ~b;
        // Bitwise Shift
        int b1 = a << 2;
        int c1 = b << 2;
        int d1 = a >> 2;
        int e1 = b >> 2;
        int f1 = a >>> 2;
        int g1 = b >>> 2;



        // Tampilkan
        System.out.println("Penggunaan Operator Aritmatika ");
        System.out.println("\nNilai awal a adalah : " + a);
        System.out.println("Nilai awal b adalah : " + b);
        System.out.println("\nHasil dari a + b = " + c);
        System.out.println("Hasil dari a - b = " + d);
        System.out.println("Hasil dari a / b = " + e);
        System.out.println("Hasil dari a / b = " + f);
        System.out.println("Hasil dari a * b = " + g);
        System.out.println("Hasil dari a % b = " + h);
    }
}
