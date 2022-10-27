import java.util.Scanner;
public class UtsNo3 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        double bilangan,pangkat,hasil;
        System.out.println("-----------------------------------------------");

        System.out.printf(" Masukan Bilangan yang akan dipangkatkan : ");
        bilangan = scn.nextInt();
        System.out.printf(" Masukan Angka Pemangkat                 : ");
        pangkat = scn.nextInt();
        System.out.println("-----------------------------------------------");
        hasil = Math.pow(bilangan, pangkat);
        System.out.println(" hasil dari "+bilangan+" pangkat "+pangkat+" adalah "+hasil);
        System.out.println("-----------------------------------------------");
    }
}