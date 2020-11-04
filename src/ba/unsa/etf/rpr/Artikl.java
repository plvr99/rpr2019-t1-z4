package ba.unsa.etf.rpr;

public class Artikl {
    private  String Naziv;
    private String Kod;
    private int cijena;

    public Artikl(String naziv, int cijena, String kod) {
        Naziv=naziv; Kod=kod; this.cijena=cijena;
    }

    public String getNaziv() {
        return Naziv;
    }

    public void setNaziv(String naziv) {
        Naziv = naziv;
    }

    public String getKod() {
        return Kod;
    }

    public void setKod(String kod) {
        Kod = kod;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }
}
