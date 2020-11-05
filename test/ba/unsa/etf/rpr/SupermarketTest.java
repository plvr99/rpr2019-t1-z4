package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() throws Exception {
        Supermarket supermarket= new Supermarket();
        Artikl artikl = new Artikl("biciklo", 500, "1");
        supermarket.dodajArtikl(artikl);
        assertEquals(artikl, supermarket.getArtikli()[0]);



    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket= new Supermarket();
        Artikl artikl = new Artikl("biciklo", 500, "1");
        Artikl artikl2 = new Artikl("biciklo", 1000, "2");
        Artikl artikl3 = new Artikl("biciklo", 1000, "3");
        supermarket.izbaciArtiklSaKodom("2");
        assertEquals(artikl3, supermarket.getArtikli()[1]);

    }
}