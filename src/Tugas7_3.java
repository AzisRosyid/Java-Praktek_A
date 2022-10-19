import java.util.Scanner;

public class Tugas7_3 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100), d = 1;
        int[] data = new int[a];

        for(int i = 0; i < a; i++) data[i] = (int)(Math.random()*100);

        // while(true) {
        //     while(true) {
        //         try {
        //             System.out.printf("Masukkan Data ke-" + i + " : ");
        //             Scanner scnA = new Scanner(System.in);
        //             a += scnA.nextInt();
        //             i++;
        //             break;
        //         } catch (Exception e) {
        //             System.out.println("\nData harus berformat nomor!\n");
        //         }
        //     }
        //     System.out.printf("Mau memasukkan data lagi [y/t] ? ");
        //     Scanner scnC = new Scanner(System.in);
        //     String confirm = scnC.next();
        //     if(confirm.equals("t")) break;
        // }

        System.out.print("Data Awal : [");
        for(int i: data) {
            System.out.print(i);
            if(i != data[data.length - 1]) System.out.print(", ");
        }
        System.out.print("]\n\n");
        
        for(int i = data.length - 1; i > 0; i--) for(int j = 0; j < i; j++) {
            int k = j + 1;
            if(data[j] > data[k]) {
                int temp = data[j];
                data[j] = data[k];
                data[k] = temp;
            }
        }
        
        System.out.print("Data Setelah Disorting : [");
        for(int i: data) {
            System.out.print(i);
            if(i != data[data.length - 1]) System.out.print(", ");
        }
        System.out.print("]\n\n");
    }
}
