package entities;

public class User {
    private String ime;
    private String prezime;
    private String oib;

    public User(String ime, String prezime, String oib) {
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    @Override
    public String toString() {
        return "User{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", oib='" + oib + '\'' +
                '}';
    }
}
