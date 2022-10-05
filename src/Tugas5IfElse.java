import java.util.Scanner;

public class Tugas5IfElse {
    public static void main(String[] args) {
        // Input Nilai
        int nilai;
        String grade = "";
        while(true) {
            try {
                System.out.printf("Masukkan Nilai : ");
                Scanner scnNilai = new Scanner(System.in);
                nilai = scnNilai.nextInt();
                scnNilai.close();
                break;
            } catch (Exception e) {
                System.out.println("\nNilai harus berformat nomor!\n");
            }
        }

        // If dan Else
        if(nilai > 85) grade = "A";
        else if (nilai > 80) grade = "A-";
        else if (nilai > 76) grade = "B+";
        else if (nilai > 74) grade = "B";
        else if (nilai > 70) grade = "B-";
        else if (nilai > 65) grade = "C+";
        else if (nilai > 60) grade = "C";
        else if (nilai > 55) grade = "C-";
        else if (nilai > 50) grade = "D";
        else if (nilai <= 50) grade = "E";

        System.out.println("Grade anda : " + grade);
    }
}

