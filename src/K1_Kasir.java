import java.io.PrintWriter;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class K1_Kasir {
    public static void main(String[] args) {
        System.out.println("============================================\nProgram Nota Pembelian \n============================================");
        List<Order> orders = new ArrayList<>();
        List<Menu> menus = K1_DataMenu.getMenus();
        System.out.println("MENU MAKANAN : ");
        System.out.println("___________________________________________________________________");
        System.out.println("No Nama                    Harga          Kode");
        System.out.println("1. Mie Instan           Rp 3500,00        MENU001");
        System.out.println("2. Telur                Rp 25000,00       MENU002");
        System.out.println("3. Beras 1kg            Rp 12000,00       MENU003");
        System.out.println("4. Minyak 1 liter       Rp 16000,00       MENU004");
        System.out.println("5. Gula                 Rp 10000,00       MENU005");
        System.out.println("6. Kopi                 Rp 5000,00        MENU006");
        System.out.println("7. Teh                  Rp 4000,00        MENU007");
        System.out.println("8. Syrup                Rp 20000,00       MENU008");
        System.out.println(""); 
        System.out.println("___________________________________________________________________");
        while(true) {
            Menu pilih; int jumlah;
            System.out.print("\n");
            Scanner scn = new Scanner(System.in);
            while(true) {
                System.out.printf("Masukkan ID Menu : ");
                pilih = findMenu(menus, scn.nextLine());
                if (pilih == null) {
                    System.out.println("\nID Menu tidak ditemukan!\n");
                    continue;
                }
                break;
            }
            while(true) {
                try {
                    System.out.printf("Masukkan Jumlah " + pilih.getNama() + " : ");
                    jumlah = scn.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("\nJumlah Barang harus berformat nomor!\n");
                }
            }

            orders.add(new Order(pilih, jumlah));
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
        String date = String.valueOf(LocalDate.now());
        int spc = 2; int range = 5;
        int tanggalLength = 13, namaLength = 11 + spc, jumlahLength = 6 + spc,  hargaLength = 12 + spc, noLength = String.valueOf(orders.size()).length() > 2? String.valueOf(orders.size()).length() + 1 + spc: 2 + spc, totalLength = 11 + spc;
        double total = 0, bayar = 0, kembalian = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getMenu().getNama().length() + spc > namaLength) namaLength = orders.get(i).getMenu().getNama().length() + spc;
            if (String.valueOf(orders.get(i).getJumlah()).length() + spc > jumlahLength) jumlahLength = String.valueOf(orders.get(i).getJumlah()).length() + spc;
            if (curr(orders.get(i).getMenu().getHarga()).length() + spc > hargaLength) hargaLength = curr(orders.get(i).getMenu().getHarga()).length() + spc;
            double totalHarga = orders.get(i).getMenu().getHarga() * orders.get(i).getJumlah();
            if (curr((orders.get(i).getMenu().getHarga() * orders.get(i).getJumlah())).length() + spc > totalLength) hargaLength = curr(totalHarga).length() + spc;
            total += totalHarga;
        }
        if (curr(total).length() + spc > totalLength) totalLength = curr(total).length() + spc;
        String columns = String.format("| %" + -noLength + "s| %" + -namaLength + "s| %" + -jumlahLength + "s| %" + -hargaLength + "s| %" + -totalLength + "s|", "NO", "Nama Barang", "Jumlah", "Harga Satuan", "Harga Total");
        int columnsLength = columns.length();
        
        while(true) {
            System.out.println("\n\n" + "=".repeat(columnsLength));
            System.out.printf("|%" + (columnsLength/2-(3*spc) - 2)+ "sNOTA PEMBELIAN" + "%" + (columnsLength/2-(3*spc) - (columnsLength % 2 == 0 ? 2 : 1)) + "s|\n|" + " ".repeat(columnsLength - 2) + "|\n" + "=".repeat(columnsLength) + "\n| Tanggal : %" + -(columnsLength - tanggalLength) + "s|\n", "", "", date);
            System.out.println("=".repeat(columnsLength) + "\n" + columns + "\n" + "=".repeat(columnsLength));
            for (int i = 0; i < orders.size(); i++) System.out.printf("| %" + -noLength + "s| %" + -namaLength + "s| %" + -jumlahLength + "s| %" + -hargaLength + "s| %" + -totalLength + "s|\n", ((i + 1) + "."), orders.get(i).getMenu().getNama(), orders.get(i).getJumlah(), curr(orders.get(i).getMenu().getHarga()), curr(orders.get(i).getMenu().getHarga() * orders.get(i).getJumlah()));
            System.out.println("=".repeat(columnsLength));
            System.out.printf("| %" + -(columnsLength - range - totalLength) + "s| %" + -totalLength + "s|\n", "Total", curr(total));
            System.out.println("=".repeat(columnsLength));
            System.out.printf("| %" + -(columnsLength - range - totalLength) + "s| Rp", "Bayar");
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
            System.out.printf("| %" + -(columnsLength - range - totalLength) + "s| %" + -totalLength + "s|\n", "Kembalian", curr(kembalian));
            System.out.println("=".repeat(columnsLength));
            break;
        }

        // PrintWriter pw = new PrintWriter(new FileOutputStream("nota_pembelian.txt", true))
        try (PrintWriter pw = new PrintWriter("nota_pembelian.txt")) {  
            if (curr(bayar).length() + spc > totalLength) totalLength = curr(bayar).length() + spc;
            columns = String.format("| %" + -noLength + "s| %" + -namaLength + "s| %" + -jumlahLength + "s| %" + -hargaLength + "s| %" + -totalLength + "s|", "NO", "Nama Barang", "Jumlah", "Harga Satuan", "Harga Total");
            columnsLength = columns.length();
            pw.println("=".repeat(columnsLength));
            pw.printf("|%" + (columnsLength/2-(3*spc) - 2)+ "sNOTA PEMBELIAN" + "%" + (columnsLength/2-(3*spc) - (columnsLength % 2 == 0 ? 2 : 1)) + "s|\n|" + " ".repeat(columnsLength - 2) + "|\n" + "=".repeat(columnsLength) + "\n| Tanggal : %" + -(columnsLength - tanggalLength) + "s|\n", "", "", date);
            pw.println("=".repeat(columnsLength) + "\n" + columns + "\n" + "=".repeat(columnsLength));
            for (int i = 0; i < orders.size(); i++) pw.printf("| %" + -noLength + "s| %" + -namaLength + "s| %" + -jumlahLength + "s| %" + -hargaLength + "s| %" + -totalLength + "s|\n", ((i + 1) + "."), orders.get(i).getMenu().getNama(), orders.get(i).getJumlah(), curr(orders.get(i).getMenu().getHarga()), curr(orders.get(i).getMenu().getHarga() * orders.get(i).getJumlah()));
            pw.println("=".repeat(columnsLength));
            pw.printf("| %" + -(columnsLength - range - totalLength) + "s| %" + -totalLength + "s|\n", "Total", curr(total));
            pw.println("=".repeat(columnsLength));
            pw.printf("| %" + -(columnsLength - range - totalLength) + "s| %" + -totalLength + "s|\n", "Bayar", curr(bayar));
            pw.println("=".repeat(columnsLength));
            pw.printf("| %" + -(columnsLength - range - totalLength) + "s| %" + -totalLength + "s|\n", "Kembalian", curr(kembalian));
            pw.println("=".repeat(columnsLength));
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String curr(double value) {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(value);
    }

    private static Menu findMenu(List<Menu> menus, String id) {
        for (Menu menu: menus) if(menu.getId().equals(id)) return menu;

        System.out.println(id);
        return null;
    }
}