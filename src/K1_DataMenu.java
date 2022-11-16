import java.util.ArrayList;
import java.util.List;

public class K1_DataMenu {
    public static List<Menu> getMenus() {
        String[] idMenu = {"MENU001", "MENU002", "MENU003", "MENU004", "MENU005", "MENU006", "MENU007", "MENU008"};
        String[] namaMenu = {"Mie Instan", "Telur", "Beras 1kg", "Minyak 1 liter", "Gula", "Kopi", "Teh", "Syrup"};
        double[] hargaMenu = {3500, 25000, 12000, 16000, 10000, 5000, 4000, 20000};
        final List<Menu> dataMenu = new ArrayList<>();

        for(int i = 0; i < namaMenu.length; i++) dataMenu.add(new Menu(idMenu[i], namaMenu[i], hargaMenu[i]));

        return dataMenu;
    }
}
