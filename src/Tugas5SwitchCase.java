import java.util.Scanner;

public class Tugas5SwitchCase {
    public static void main(String[] args) {
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

        Boolean[] cases = new Boolean[]{
            nilai > 85, 
            nilai > 80 && nilai <= 85, 
            nilai > 76 && nilai <= 80, 
            nilai > 74 && nilai <= 76, 
            nilai > 70 && nilai <= 74, 
            nilai > 65 && nilai <= 70, 
            nilai > 60 && nilai <= 65, 
            nilai > 55 && nilai <= 60, 
            nilai > 50 && nilai <= 55, 
            nilai <= 50,
        };

        String[] grades = {
            "A", "A-", "B+", "B",
            "B-", "C+", "C", "C-",
            "D", "E"
        };

        for (int i = 0; i < cases.length; i++) {
            switch(cases[i] ? 1 : 0) {
                case 1 :
                    grade = grades[i];
            }
        }

        // switch(nilai > 85 ? 1 : 0) {
        //     case 1 :
        //         grade = "A";
        // }
        // switch(nilai > 80 && nilai <= 85 ? 1 : 0) {
        //     case 1 :
        //         grade = "B";
        // }

        System.out.println("Grade anda : " + grade);
    }
}
