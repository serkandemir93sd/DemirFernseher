public class Fernseher {
    // Instance Variables (Öznitelikler)
    private String hersteller = "UNKN";
    private int zoll = 0;
    private boolean smartTv = false;

    // Konstruktor (Yapıcı Metot)
    public Fernseher(String neuHersteller, int neuZoll, boolean neuSmartTv) {
        this.hersteller = neuHersteller;
        this.zoll = neuZoll;
        this.smartTv = neuSmartTv;
    }

    // --- Getter Metotları ---
    public String getHersteller() {
        return hersteller;
    }

    public int getZoll() {
        return zoll;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    // --- Setter Metotları ---
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setZoll(int zoll) {
        this.zoll = zoll;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }
}
