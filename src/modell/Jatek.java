package modell;

public class Jatek {

    private final Lada[] ladak;

    public Jatek() {
        ladak = new Lada[3];
        ladak[0] = new Lada(false, "arany");
        ladak[1] = new Lada(true, "ezüst");
        ladak[2] = new Lada(false, "bronz");
    }

    public Lada[] getLadak() {
        return ladak;
    }
    
    public void jatekIndit(){
        
    }
}
