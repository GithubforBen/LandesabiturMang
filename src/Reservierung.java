import java.util.Date;

public class Reservierung {
    private int reservierungsNr;
    private Date vonDate;
    private Date bisDate;
    private static int autowert;
    private Geraet geraet;
    private Schueler schueler;

    public Reservierung(Date vonDate, Date bisDate, Geraet geraet, Schueler schueler) {
        this.vonDate = vonDate;
        this.bisDate = bisDate;
        this.geraet = geraet;
        this.schueler = schueler;
        reservierungsNr = +1;
        autowert++;
    }

    public int getReservierungsNr() {
        return reservierungsNr;
    }

    public void setReservierungsNr(int reservierungsNr) {
        this.reservierungsNr = reservierungsNr;
    }

    public Date getVonDate() {
        return vonDate;
    }

    public void setVonDate(Date vonDate) {
        this.vonDate = vonDate;
    }

    public Date getBisDate() {
        return bisDate;
    }

    public void setBisDate(Date bisDate) {
        this.bisDate = bisDate;
    }

    public static int getAutowert() {
        return autowert;
    }

    public static void setAutowert(int autowert) {
        Reservierung.autowert = autowert;
    }

    public Geraet getGeraet() {
        return geraet;
    }

    public void setGeraet(Geraet geraet) {
        this.geraet = geraet;
    }

    public Schueler getSchueler() {
        return schueler;
    }

    public void setSchueler(Schueler schueler) {
        this.schueler = schueler;
    }

    @Override
    public String toString() {
        return "Reservierung{" +
                "reservierungsNr=" + reservierungsNr +
                ", vonDate=" + vonDate +
                ", bisDate=" + bisDate +
                ", schueler=" + schueler +
                '}';
    }
}
