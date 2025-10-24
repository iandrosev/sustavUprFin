package entities;
import java.math.BigDecimal;

public class Record {
    private String opis;
    private BigDecimal iznos;
    private User korisnik;
    private String id;

    public Record(BigDecimal iznos, User korisnik, String id, String opis) {
        this.iznos = iznos;
        this.korisnik = korisnik;
        this.id = id;
        this.opis = opis;
    }



    @Override
    public String toString() {
        return "Record{" +
                "opis='" + opis + '\'' +
                ", iznos=" + iznos +
                ", korisnik=" + korisnik +
                ", id='" + id + '\'' +
                '}';
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public BigDecimal getIznos() {
        return iznos;
    }

    public void setIznos(BigDecimal iznos) {
        this.iznos = iznos;
    }

    public User getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(User korisnik) {
        this.korisnik = korisnik;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

