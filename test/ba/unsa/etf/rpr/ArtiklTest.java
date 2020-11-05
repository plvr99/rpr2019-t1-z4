package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    Artikl artikl= new Artikl("biciklo", 1000, "1");
    @Test
    void getNaziv() {
        assertEquals("biciklo", artikl.getNaziv());
    }

    @Test
    void getKod() {
        assertEquals("1", artikl.getKod());
    }

    @Test
    void getCijena() {
        assertEquals(1000, artikl.getCijena());
    }
}