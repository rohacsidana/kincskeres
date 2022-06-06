package teszt;

import modell.Jatek;

public class KincskeresTeszt {

    static Jatek jatek = new Jatek();

    public static void main(String[] args) {
        //ladabanKincs(0); sikertelen
        ladabanKincs(1);//sikeres
        //ladabanNincsKincs(1); sikertelen
        ladabanNincsKincs(0);
        ladabanNincsKincs(2);
    }

    public static void ladabanKincs(int hanyadik) {
        System.out.println("ladabanKincs teszt");
        assert jatek.getLadak()[hanyadik].isKincses() : "ladabanKincs teszt sikertelen";
        System.out.println("---ladabanKincs teszt sikeres---");
    }
    public static void ladabanNincsKincs(int hanyadik){
        System.out.println("ladabanNincsKincs teszt");
        assert !jatek.getLadak()[hanyadik].isKincses() : "ladabanNincsKincs teszt sikertelen";
        System.out.println("---ladabanNincsKincs teszt sikeres---");
    }
}
