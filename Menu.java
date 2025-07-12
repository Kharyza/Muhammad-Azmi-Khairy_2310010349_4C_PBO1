package UAS;

// 1. Class & 7. Encapsulation
public abstract class Menu {
    // 3. Atribut (private)
    private final String nama;
    private double harga;

    // 4. Constructor
    public Menu(String nama, double harga) {
        this.nama  = nama;
        this.harga = harga;
    }

    // 6. Accessor
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // 5. Mutator
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // 9. Polymorphism: subclass wajib override
    public abstract String deskripsi();
}
