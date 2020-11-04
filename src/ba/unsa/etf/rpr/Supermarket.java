package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int brArtikala;

    public boolean dodajArtikl(Artikl x) throws Exception {
        if(brArtikala < 1000){
            artikli[brArtikala] = x;
            brArtikala = brArtikala + 1;
        }else throw new Exception("Supermarket popunjen");
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl rez = new Artikl("x",1,"x");
        for (int i = 0; i < artikli.length; i++) {
            if(artikli[i].getKod().equals(kod)){
                rez = artikli[i];
                artikli[i]=null;
                for (int j = i; j < artikli.length -1; j++) {
                    artikli[j] = artikli[j+1];
                }
                brArtikala = brArtikala -1;
                break;
            }
        }
        return rez;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

}
