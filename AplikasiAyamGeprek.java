package UAS;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AplikasiAyamGeprek {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Pesanan pesanan = new Pesanan(10);  // maksimal 10 item
            boolean lanjut  = true;
            
            // 11. Perulangan utama
            while (lanjut) {
                try {
                    // 12. IO Sederhana & 10. Seleksi
                    System.out.println("\n=== MENU AYAM GEPREK ===");
                    System.out.println("1. Ayam Geprek Original  - Rp15.000");
                    System.out.println("2. Ayam Geprek Keju      - Rp18.000");
                    System.out.println("0. Selesai & Cetak Struk");
                    System.out.print("Pilih (0-2): ");
                    int pilih = input.nextInt();
                    
                    switch (pilih) {
                        case 1 -> {
                            pesanan.tambahMenu(new AyamGeprekOriginal());
                            System.out.println("-> Ditambahkan: Original");
                        }
                        case 2 -> {
                            pesanan.tambahMenu(new AyamGeprekKeju());
                            System.out.println("-> Ditambahkan: Keju");
                        }
                        case 0 -> lanjut = false;
                        default -> System.out.println("Pilihan tidak valid.");
                    }
                    
                } catch (InputMismatchException e) {
                    System.out.println("Input harus angka!");
                    input.nextLine();  // buang input salah
                } catch (PesananPenuhException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
            
            // Cetak struk akhir
            System.out.println("\n--- STRUK PESANAN ---");
            for (int i = 0; i < pesanan.getJumlah(); i++) {
                Menu m = pesanan.getDaftarMenu()[i];
                System.out.printf("%2d. %-25s Rp%,10.0f | %s%n",
                        i + 1,
                        m.getNama(),
                        m.getHarga(),
                        m.deskripsi()
                );
            }
            
            // Hitung total dengan class TotalBayar
            double total = TotalBayar.hitungTotal(pesanan);
            System.out.printf("Total Bayar: Rp%,.0f%n", total);
        } // maksimal 10 item
    }
}