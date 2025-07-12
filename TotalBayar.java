package UAS;

// Utility class untuk menghitung total harga
public class TotalBayar {
    // Metode statis agar mudah dipanggil
    public static double hitungTotal(Pesanan p) {
        double total = 0;
        for (int i = 0; i < p.getJumlah(); i++) {
            total += p.getDaftarMenu()[i].getHarga();
        }
        return total;
    }
}
