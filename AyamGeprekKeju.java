package UAS;

// 8. Inheritance
public class AyamGeprekKeju extends Menu {
    // 4. Constructor
    public AyamGeprekKeju() {
        super("Ayam Geprek Keju", 18000);
    }

    /**
     *
     * @return
     */
    @Override
    // 9. Polymorphism
    public String deskripsi() {
        return "Taburan keju leleh gurih";
    }
}