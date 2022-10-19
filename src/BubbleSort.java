import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        String pesan;
        //Memasukkan jumlah Data
        System.out.print("Masukkan jumlah Data : ");
        Scanner inputdata = new Scanner(System.in);
        int jml_data = inputdata.nextInt();
        int[] data = new int[jml_data];
        System.out.println();
        //Memasukkan data
        for(int i = 0; i < jml_data; i++) {
        System.out.print("Nilai Data ke " + (i+1) + ". : ");
        data[i] = inputdata.nextInt();
        }
        //Menampilkan Data Awal
        System.out.println("\nData Awal Sebelum di Sorting");
        for(int i = 0; i < jml_data; i++) System.out.print(data[i] + " ");
        //Prosses Sorting
        System.out.println("\nProses Sorting dengan Bubble Sort");
        for(int i = 0; i < jml_data-1; i++) {
        System.out.println("Iterasi ke " + (i+1) + ". : ");
        for(int j = 0; j < jml_data; j++) System.out.print(data[j] + " ");
        System.out.println(" Data Awal Iterasi atau Data Akhir Proses Iterasi Sebelumnya");
        for(int m = 0; m < jml_data-1; m++) {
        if(data[m] < data[m+1]) pesan = " " + data[m] + " < " + data[m+1] + " : benar, Tidak ada pertukaran";
        else {
        pesan = " " + data[m] + " < " + data[m+1] + " :salah, Data " + data[m] + " ditukar dengan " + data[m+1];
        int temp = data[m];
        data[m] = data[m+1];
        data[m+1] = temp;
        }
        if(m < jml_data-(i+1)) {
        for(int k = 0; k < jml_data; k++) System.out.print(data[k] + " ");
        System.out.println(pesan);
    }
}
System.out.println("\n");
}
System.out.print("Data Setelah di Sorting : ");
for(int i = 0; i < jml_data; i++) System.out.print(data[i] + " ");
}
      
}
