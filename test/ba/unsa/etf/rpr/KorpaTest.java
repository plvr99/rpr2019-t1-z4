package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() throws Exception {
        Korpa korpa = new Korpa();
        Artikl artikl1 = new Artikl("biciklo", 1000, "1");
        Artikl artikl2 = new Artikl("biciklo", 1000, "2");
        Artikl artikl3 = new Artikl("biciklo", 1000, "3");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        assertEquals(null, korpa.getArtikli()[2]);
        assertEquals(artikl1, korpa.getArtikli()[0]);

    }

    @Test
    void izbaciArtiklSaKodom() throws Exception {
        Korpa korpa = new Korpa();
        Artikl artikl1 = new Artikl("biciklo", 1000, "1");
        Artikl artikl2 = new Artikl("biciklo", 1000, "2");
        Artikl artikl3 = new Artikl("biciklo", 1000, "3");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);
        korpa.izbaciArtiklSaKodom("3");
        assertEquals(null, korpa.getArtikli()[2]);
    }

    @Test
    void dajUkupnuCijenuArtikala() throws Exception {
        Korpa korpa = new Korpa();
        Artikl artikl1 = new Artikl("biciklo", 1000, "1");
        Artikl artikl2 = new Artikl("biciklo", 1000, "2");
        Artikl artikl3 = new Artikl("biciklo", 1000, "3");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);
        int ukupnaCijena= korpa.dajUkupnuCijenuArtikala();
        assertEquals(3000, ukupnaCijena);
    }
}