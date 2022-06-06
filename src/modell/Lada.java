package modell;

public class Lada {

    private final boolean kincses;
    private final String szin;

    public Lada(boolean kincses, String szin) {
        this.kincses = kincses;
        this.szin = szin;
    }

    public boolean isKincses() {
        return kincses;
    }

    public String getSzin() {
        return szin;
    }

}
