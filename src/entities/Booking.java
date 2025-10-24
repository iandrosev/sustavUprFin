package entities;

public class Booking {
    private String datum;
    private User user;
    private String id;

    public Booking(String datum, User user, String id) {
        this.datum = datum;
        this.user = user;
        this.id = id;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "datum='" + datum + '\'' +
                ", user=" + user +
                ", id='" + id + '\'' +
                '}';
    }
}
