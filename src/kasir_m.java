import java.util.Scanner;
public class kasir_m {
 
public static void main (String args[]) {
//inisialisasi java library scanner
    Scanner scan = new Scanner(System.in);
//menampilkan menu makanan
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
    
//inisialisasi pembayaran awal
    int total_harga = 0, temp=0;
    int daftar_pesan[]=new int[99];
    for (String i = "Y"; i.equals("Y")||i.equals("y"); ){
   
//pengguna memasukkan nomor pesanan
    System.out.println("No.pemesanan["+(temp+1)+"]");
    System.out.print("Pesanan :");
    daftar_pesan[temp]=scan.nextInt();
    System.out.println("");
     
//User diperintahkan untuk memasukkan data apakah dia akan melanjutkan atau tidak
   System.out.println("Apakah anda mau melanjutkan? Y/T");
   i = scan.next();
   System.out.println(""); 
   temp++;
}
   System.out.println("");
   System.out.println("");
   System.out.println("");
   System.out.println("______________________________________________|");
   System.out.println("                Daftar Pemesanan              |");
   System.out.println("______________________________________________|");
   System.out.println("No.  |   Pesananan   | Harga                  |");
   System.out.println("----------------------------------------------|");
   for(int c=0; c<temp; c++){
 switch (daftar_pesan[c]){
  case 1: 
   System.out.println((c+1)+ "    |Mie Instan     |Rp.3500,00              |");
   total_harga+=3500;
  break;
  case 2: 
   System.out.println((c+1)+ "    |Telur          |Rp.25000,00             |");
   total_harga+=25000;
  break;
  case 3: 
   System.out.println((c+1)+ "    |Beras 1kg      |Rp.12000,00             |");
   total_harga+=12000;
  break;
  case 4: 
   System.out.println((c+1)+ "    |Minyak 1 liter |Rp.16000,00             |");
   total_harga+=16000;
  break;
  case 5: 
   System.out.println((c+1)+ "    | Gula          |Rp.10000,00             |");
   total_harga+=10000;
  break;
  case 6: 
   System.out.println((c+1)+ "    | Kopi          |Rp.5000,00              |");
   total_harga+=5000;
  break;
  case 7: 
   System.out.println((c+1)+ "    | Teh           |Rp.4000,00              |");
   total_harga+=4000;
  break;
  case 8: 
   System.out.println((c+1)+ "    | Syrup         |Rp.20000,00             |");
   total_harga+=20000;
  break;
  default:
   System.out.println((c+1)+ "    |tidak tersedia pada daftar |");
  break;
 }
   }
 System.out.println("______________________________________________|");
        System.out.println("Total                |" +total_harga+".                 |");
        System.out.println("______________________________________________|");
        System.out.println("");
        System.out.println("Terimakasih atas kunjungannya.");
 }
}
