import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Tugas3Kotak {
    public static void main(String[] args) {
        // Input Data
        String nama = JOptionPane.showInputDialog(null, "Masukkan Nama", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);
        long nim;
        while(true) {
            try {
                nim = Long.parseLong(JOptionPane.showInputDialog(null, "Masukkan NIM", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data NIM harus berformat nomor!", "Error!", JOptionPane.QUESTION_MESSAGE);
            }
        }
        String noTelp;
        while(true) {
            try {
                noTelp = JOptionPane.showInputDialog(null, "Masukkan Nomor Telepon", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);
                Long.parseLong(noTelp);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Nomor Telepon harus berformat nomor!", "Error!", JOptionPane.QUESTION_MESSAGE);
            }
        }
        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);

        // Tampilkan Data
        JOptionPane.showMessageDialog(null, nama, "Tampilkan Data Nama", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, nim, "Tampilkan Data NIM", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, noTelp, "Tampilkan Data Nomor Telepon", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, alamat, "Tampilkan Data Alamat", JOptionPane.QUESTION_MESSAGE);
    }
}

