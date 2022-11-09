import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Explore {
    public static void main(String[] args) {
        System.out.println("============================================\nProgram Nota Pembelian \n============================================");
        List<String> namaBarang = new ArrayList<String>();
        List<Integer> jumlahBarang = new ArrayList<Integer>();
        List<Double> hargaBarang = new ArrayList<Double>();
        String[] namaMenu = {"Mie Instan", "Telur", "Beras 1kg", "Minyak 1 liter", "Gula", "Kopi", "Teh", "Syrup"};
        double[] hargaMenu = {3500, 25000, 12000, 16000, 10000, 5000, 4000, 20000};
        String[] idMenu = {"MENU001", "MENU002", "MENU003", "MENU004", "MENU005", "MENU006", "MENU007", "MENU008"};
        System.out.println("MENU MAKANAN : ");
        System.out.println("___________________________________________________________________");
        System.out.println("No Nama                    Harga");
        System.out.println("1. Mie Instan           Rp 3500,00");
        System.out.println("2. Telur                Rp 25000,00");
        System.out.println("3. Beras 1kg            Rp 12000,00");
        System.out.println("4. Minyak 1 liter       Rp 16000,00");
        System.out.println("5. Gula                 Rp 10000,00");
        System.out.println("6. Kopi                 Rp 5000,00");
        System.out.println("7. Teh                  Rp 4000,00");
        System.out.println("8. Syrup                Rp 20000,00");
        System.out.println(""); 
        System.out.println("___________________________________________________________________");
        while(true) {
            int jumlah; int pilih;
            System.out.print("\n");
            Scanner scn = new Scanner(System.in);
            while(true) {
                try {
                    System.out.printf("Masukkan ID Menu : ");
                    pilih = Arrays.asList(idMenu).indexOf(scn.nextLine());
                    namaBarang.add(namaMenu[pilih]);
                    break;
                } catch (Exception e) {
                    System.out.println("\nID Menu tidak ditemukan!\n");
                }
            }
            while(true) {
                try {
                    System.out.printf("Masukkan Jumlah " + namaMenu[pilih] + " : ");
                    jumlah = scn.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("\nJumlah Barang harus berformat nomor!\n");
                }
            }

            jumlahBarang.add(jumlah); hargaBarang.add(hargaMenu[pilih]);
            String input = "";
            while(true) {
                System.out.print("\nApakah anda ingin menginput barang lagi? (y/n) : ");
                Scanner scnI = new Scanner(System.in);
                input = scnI.nextLine();
                if (input.equals("y") || input.equals("n")) break;
                else System.out.println("\nInput harus berupa (y/n)!");
            }
            if (input.equals("n")) break;
        }
        int spc = 2;
        int namaLength = 11 + spc, jumlahLength = 6 + spc,  hargaLength = 12 + spc, noLength = String.valueOf(namaBarang.size()).length() > 2? String.valueOf(namaBarang.size()).length() + 1 + spc: 2 + spc, totalLength = 11 + spc;
        double total = 0, bayar = 0, kembalian = 0;
        for (int i = 0; i < namaBarang.size(); i++) {
            if (namaBarang.get(i).length() + spc > namaLength) namaLength = namaBarang.get(i).length() + spc;
            if (String.valueOf(jumlahBarang.get(i)).length() + spc > jumlahLength) jumlahLength = String.valueOf(jumlahBarang.get(i)).length() + spc;
            if (curr(hargaBarang.get(i)).length() + spc > hargaLength) hargaLength = curr(hargaBarang.get(i)).length() + spc;
            double totalHarga = hargaBarang.get(i) * jumlahBarang.get(i);
            if (curr((hargaBarang.get(i) * jumlahBarang.get(i))).length() + spc > totalLength) hargaLength = curr(totalHarga).length() + spc;
            total += totalHarga;
        }
        if (curr(total).length() + spc > totalLength) totalLength = curr(total).length() + spc;
        String columns = String.format("|%" + -noLength + "s|%" + -namaLength + "s|%" + -jumlahLength + "s|%" + -hargaLength + "s|%" + -totalLength + "s|", "NO", "Nama Barang", "Jumlah", "Harga Satuan", "Harga Total");
        int columnsLength = columns.length();
        
        while(true) {
            System.out.printf("\n\n%" + (columnsLength/2-(3*spc)) + "sNOTA PEMBELIAN\n\n" + "Tanggal : " + LocalDate.now() + "\n", "");
            System.out.println("=".repeat(columnsLength) + "\n" + columns + "\n" + "=".repeat(columnsLength));
            for (int i = 0; i < namaBarang.size(); i++) System.out.printf("|%" + -noLength + "s|%" + -namaLength + "s|%" + -jumlahLength + "s|%" + -hargaLength + "s|%" + -totalLength + "s|\n", ((i + 1) + "."), namaBarang.get(i), jumlahBarang.get(i), curr(hargaBarang.get(i)), curr(hargaBarang.get(i) * jumlahBarang.get(i)));
            System.out.println("=".repeat(columnsLength));
            System.out.printf("|%" + -(columnsLength - 3 - totalLength) + "s|%" + -totalLength + "s|\n", "Total", curr(total));
            System.out.println("=".repeat(columnsLength));
            System.out.printf("|%" + -(columnsLength - 3 - totalLength) + "s|Rp", "Bayar");
            try {
                Scanner scn = new Scanner(System.in);
                bayar = scn.nextDouble();
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            System.out.println("=".repeat(columnsLength));
            kembalian = bayar - total;
            if (total > bayar)  {
                System.out.print("\nUang Pebayarannya kurang ("+ curr(total - bayar) +")!");
                Scanner end = new Scanner(System.in);
                end.nextLine();
                System.out.println("\n");
                continue;
            }
            System.out.printf("|%" + -(columnsLength - 3 - totalLength) + "s|%" + -totalLength + "s|\n", "Kembalian", curr(kembalian));
            System.out.println("=".repeat(columnsLength));
            break;
        }

        // PrintWriter pw = new PrintWriter(new FileOutputStream("nota_pembelian.txt", true))
        try (PrintWriter pw = new PrintWriter("nota_pembelian.txt")) {  
            if (String.valueOf(bayar).length() > totalLength) totalLength = String.valueOf(bayar).length();
            columns = String.format("|%" + -noLength + "s|%" + -namaLength + "s|%" + -jumlahLength + "s|%" + -hargaLength + "s|%" + -totalLength + "s|", "NO", "Nama Barang", "Jumlah", "Harga Satuan", "Harga Total");
            columnsLength = columns.length();
            pw.printf("\n%" + (columnsLength/2-6) + "sNOTA PEMBELIAN\n\n" + "Tanggal : " + LocalDate.now() + "\n", "");
            pw.println("=".repeat(columnsLength) + "\n" + columns + "\n" + "=".repeat(columnsLength));
            for (int i = 0; i < namaBarang.size(); i++) pw.printf("|%" + -noLength + "s|%" + -namaLength + "s|%" + -jumlahLength + "s|%" + -hargaLength + "s|%" + -totalLength + "s|\n", ((i + 1) + "."), namaBarang.get(i), jumlahBarang.get(i), curr(hargaBarang.get(i)), curr(hargaBarang.get(i) * jumlahBarang.get(i)));
            pw.println("=".repeat(columnsLength));
            pw.printf("|%" + -(columnsLength - 3 - totalLength) + "s|%" + -totalLength + "s|\n", "Total", curr(total));
            pw.println("=".repeat(columnsLength));
            pw.printf("|%" + -(columnsLength - 3 - totalLength) + "s|%" + -totalLength + "s|\n", "Bayar", curr(bayar));
            pw.println("=".repeat(columnsLength));
            pw.printf("|%" + -(columnsLength - 3 - totalLength) + "s|%" + -totalLength + "s|\n", "Kembalian", curr(kembalian));
            pw.println("=".repeat(columnsLength));
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String curr(double value) {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(value);
    }
}