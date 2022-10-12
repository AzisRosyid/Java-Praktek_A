import java.util.Scanner;

public class Tugas6_10 {
    public static void main(String[] args) {
        int i = 1;
        String output = "";
        while(true) {
            System.out.printf("Masukkan Input "+ i +" : ");
            Scanner scnA = new Scanner(System.in);
            output += scnA.next();
            if(output.contains("X")) break;
            i++;
        }
        System.out.println("output : " + output);
    }
}
