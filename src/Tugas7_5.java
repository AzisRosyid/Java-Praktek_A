import java.util.Random;
import java.util.Scanner;

public class Tugas7_5 {
    public static void main(String[] args) {
        int jumlahMahasiswa = 5;
        System.out.println("=== Program Menentukan Nilai Akhir serta Nilai Huruf dari " + jumlahMahasiswa + " orang mahasiswa di kelas TKIC ===\n");

        final String[] jenisNilai = {"Tugas", "UTS", "UAS"}; 
        final int[] persetaseNilai = {20, 30, 50};
        int[][] nilai = new int[jenisNilai.length][jumlahMahasiswa];
        for(int i = 0; i < jumlahMahasiswa; i++) for(int j= 0; j < jenisNilai.length; j++) {
            int a = (int)(Math.random()*100);
            // while(true) {
            //     try {
            //         System.out.printf("Masukkan Nilai " + jenisNilai[j] + ", Mahasiswa ke-" + (i + 1) + " : ");
            //         Scanner scnA = new Scanner(System.in);
            //         a = scnA.nextInt();
            //         break;
            //     } catch (Exception e) {
            //         System.out.println("\nInput harus berformat nomor!\n");
            //     }
            // }

            nilai[j][i] = a;
            if(j == jenisNilai.length - 1) System.out.println();
        }

        double nilaiAkhir = 0;
        System.out.println("\n=== Nilai Hasil ===");
        for(int i = 0; i < jenisNilai.length; i++) {
            double jumlah = 0, rata = 0;
            for(int j = 0; j < jumlahMahasiswa; j++) jumlah += nilai[i][j];
            rata = jumlah/(double)jumlahMahasiswa;
            System.out.println("Total Nilai " + jenisNilai[i] + " : " + jumlah + ", " + "rata-rata : " + rata);
            nilaiAkhir += rata * ((double)persetaseNilai[i] / 100.0);
        }
        
        System.out.println("Total Nilai rata-rata : " + nilaiAkhir);
    }
}
