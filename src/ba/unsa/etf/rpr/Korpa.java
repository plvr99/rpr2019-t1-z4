package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int brArtikala;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl x) throws Exception {
        if(brArtikala < 50){
            artikli[brArtikala] = x;
            brArtikala++;
        }else throw new Exception("Supermarket popunjen");
        return  true;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl povratni = new Artikl("x", 1, "x");
        for (int i = 0; i < artikli.length; i++) {
            if(artikli[i].getKod().equals(kod)){
                povratni = artikli[i];
                artikli[i]=null;
                for (int j = i; j < artikli.length-1; j++) {
                    artikli[j]=artikli[j+1];
                }
                brArtikala = brArtikala - 1;
                break;
            }
        }
        return povratni;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma = 0;
        for (int i = 0; i < artikli.length; i++) {
            suma += artikli[i].getCijena();
        }
        return suma;
    }
}
