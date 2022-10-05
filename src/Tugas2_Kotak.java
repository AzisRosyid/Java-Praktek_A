import javax.swing.JOptionPane;

public class Tugas2_Kotak {
    public static void main(String[] args) {
        String nama, nim, alamat;
        final String dialogInputTitle = "Memasukkan Data";
        final String dialogMessageTitle = "Tampilkan Data";
        nama = JOptionPane.showInputDialog(null, "Masukkan Nama", dialogInputTitle, JOptionPane.QUESTION_MESSAGE);
        nim = JOptionPane.showInputDialog(null, "Masukkan NIM", dialogInputTitle, JOptionPane.QUESTION_MESSAGE);
        alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat", dialogInputTitle, JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, nama, dialogMessageTitle, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, nim, dialogMessageTitle, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, alamat, dialogMessageTitle, JOptionPane.QUESTION_MESSAGE);
    }
}