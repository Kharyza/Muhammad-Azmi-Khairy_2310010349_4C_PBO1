package UAS;

// 2. Object, 13. Array
public class Pesanan {
    // 3. Atribut
    private final Menu[] daftarMenu;
    private int jumlah;

    // 4. Constructor
    public Pesanan(int kapasitas) {
        daftarMenu = new Menu[kapasitas];
        jumlah     = 0;
    }

    // 5. Mutator: tambah item
    public void tambahMenu(Menu m) throws PesananPenuhException {
        if (jumlah >= daftarMenu.length) {
            throw new PesananPenuhException("Pesanan sudah penuh.");
        }
        daftarMenu[jumlah++] = m;
    }

    // 6. Accessor: ambil daftar menu
    public Menu[] getDaftarMenu() {
        return daftarMenu;
    }

    // 6. Accessor: ambil jumlah item
    public int getJumlah() {
        return jumlah;
    }
}
