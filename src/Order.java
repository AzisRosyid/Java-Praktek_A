public class Order {
    private Menu menu;
    private int jumlah;

    public Order(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
