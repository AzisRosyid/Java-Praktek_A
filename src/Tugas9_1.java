import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Tugas9_1 {
    private static String folderPath = "";
    private static String defaultPath = "filepath.txt";

    public static void main(String[] args) throws IOException {
        opsiMenu();
    }

    private static void opsiMenu() throws IOException {
        menu:
        while (true) {
            String menu = "=== Program Membuat dan Membaca File 1 ===";
            menu += String.format("\nFolder Path : %s", folderPath.equals("") ? "Not Selected!" : folderPath);
            menu += "\nMenu Opsi : \n1. Pilih Folder Path\n2. Tambah Folder Path\n3. Baca File\n4. Buat File\n5. Tutup Program\n\nPilih Opsi : ";
            System.out.printf(menu);
            Scanner scn = new Scanner(System.in);
            int opsi = scn.nextInt();
            switch (opsi) {
                case 1:
                    pilihFolderPath();
                    break;
                case 2:
                    tambahFolderPath();
                    break;
                case 3:
                    bacaFile();
                    break;
                case 4:
                    buatFile();
                    break;
                case 5:
                    break menu;
                default:
                    break;
            }
            System.out.println("\n\n");
        }
    }

    private static void pilihFolderPath() throws IOException {
        while (true) {
            System.out.print("\nFolder Path : ");
            FileReader fr = new FileReader(defaultPath);
            Scanner fscn = new Scanner(fr);
            int i = 1;
            while (fscn.hasNext()) {
                System.out.printf("\n%s. %s", i, fscn.next());
                i++;
            }
            System.out.print("\n\nPilih Folder Path : ");
            Scanner scn = new Scanner(System.in);
            int opsi = scn.nextInt();
            Scanner df = new Scanner(new FileReader(defaultPath));
            for (int j = 0; j < opsi; j++) 
                folderPath = df.next();
            break;
        }
    }

    private static void tambahFolderPath() throws IOException {
        while (true) {
            System.out.print("\nMasukkan Folder Path : ");
            Scanner scn = new Scanner(System.in);
            String path = scn.next();
            if (Files.isDirectory(Paths.get(path))) {
                PrintWriter pw = new PrintWriter(new FileOutputStream(defaultPath, true));
                pw.write(path + " ");
                pw.flush();
                pw.close();
                break;
            }
            System.out.println("\nPath yang Anda masukkan tidak valid!\n");
        }
    }

    private static void bacaFile() throws IOException {
        System.out.print("\nMasukkan Nama File : ");
        Scanner scn = new Scanner(System.in);
        String fileName = scn.next();
        FileReader fr = new FileReader(folderPath + "\\" + fileName);
        Scanner fscn = new Scanner(fr);
        System.out.println();
        while (fscn.hasNext()) {
            String nama = fscn.next();
            int jumlah = fscn.nextInt();
            double harga = fscn.nextDouble();
            System.out.printf("%s %d %f %f\n", nama, jumlah, harga, jumlah * harga);
        }
        if (fr != null)
            fr.close();
        System.out.print("\nClick Enter to Continue! ");
        System.in.read();
    }

    private static void buatFile() throws IOException {
        String nama;
        int jumlah;
        double harga;
        char tanya;
        File file = new File(folderPath + "\\contohfile.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.printf("Nama : ");
        Scanner scnName = new Scanner(System.in);
        nama = scnName.next();
        while (!nama.equalsIgnoreCase("x")) {
            Scanner scn = new Scanner(System.in);
            System.out.printf("Jumlah : ");
            jumlah = scn.nextInt();
            System.out.printf("Harga : ");
            harga = scn.nextDouble();
            System.out.printf("Disimpan(Y/T)? ");
            tanya = scn.next().toUpperCase().charAt(0);
            if (tanya == 'Y') {
                bw.write(nama + " ");
                bw.write(String.valueOf(jumlah) + " ");
                bw.write(String.valueOf(harga) + " ");
                bw.flush();
            }
            System.out.println();
            System.out.printf("Nama : ");
            nama = scn.next();
        }
        if (fw != null)
            fw.close();
    }
}
