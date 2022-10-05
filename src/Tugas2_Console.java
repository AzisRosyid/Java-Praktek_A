import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tugas2_Console{
    public static void main(String[] args) {
        String nama, nim, alamat;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan Nama : ");
            nama = br.readLine();
            System.out.print("Masukkan NIM : ");
            nim = br.readLine();
            System.out.print("Masukkan Alamat : ");
            alamat = br.readLine();
            System.out.println("\nNama : " + nama);
            System.out.println("NIM : " + nim);
            System.out.println("Alamat : " + alamat);
        } catch (Exception e) {
            System.out.println("Error");
        } 
    }
}
