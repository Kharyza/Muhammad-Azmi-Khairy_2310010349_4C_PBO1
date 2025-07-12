package UAS;

// 8. Inheritance
public class AyamGeprekOriginal extends Menu {
    // 4. Constructor
    public AyamGeprekOriginal() {
        super("Ayam Geprek Original", 15000);
    }

    /**
     *
     * @return
     */
    @Override
    // 9. Polymorphism
    public String deskripsi() {
        return "Sambal bawang pedas nikmat";
    }
}
