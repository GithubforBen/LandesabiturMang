public class Schueler {
    private int ausweisNr;
    private String vorname;
    private String nachname;

    public Schueler (int nr, String nn, String vn){
        this.ausweisNr = nr;
        this.vorname = vn;
        this.nachname = nn;
    }

    public int getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(int ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return "Schueler{" +
                "ausweisNr=" + ausweisNr +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
