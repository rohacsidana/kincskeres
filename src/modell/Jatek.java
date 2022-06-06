package modell;

import gui.KincskeresGui;

public class Jatek {

    private final Lada[] ladak;

    public Jatek() {
        ladak = new Lada[3];
        ladak[0] = new Lada(false);
        ladak[1] = new Lada(true);
        ladak[2] = new Lada(false);
    }

    public Lada[] getLadak() {
        return ladak;
    }
    
    public void jatekIndit(){
        KincskeresGui jatekGui = new KincskeresGui();
        jatekGui.setLocationRelativeTo(null);
        jatekGui.setVisible(true);
        
    }
}
