import java.util.Date;
import java.util.*;

public class Geraet {
    private int gerateNr;
    private boolean einsatzBereit;
    private Geraetetyp geraetetyp;
    private List<Reservierung> reservierungen;

    public Geraet(Geraetetyp typ) {
        reservierungen = new LinkedList<>();
    }

    public boolean istFrei(Date von, Date bis) {
        for (int i = 0; i < reservierungen.size(); i++) {
            Reservierung reservierung = reservierungen.get(i);
            if (reservierung.getVonDate().before(bis) || reservierung.getBisDate().after(von)) {
                return true;
            }
        }
        return false;
    }

    public int getGerateNr() {
        return gerateNr;
    }

    public void setGerateNr(int gerateNr) {
        this.gerateNr = gerateNr;
    }

    public boolean isEinsatzBereit() {
        return einsatzBereit;
    }

    public void setEinsatzBereit(boolean einsatzBereit) {
        this.einsatzBereit = einsatzBereit;
    }

    public Geraetetyp getGeraetetyp() {
        return geraetetyp;
    }

    public void setGeraetetyp(Geraetetyp geraetetyp) {
        this.geraetetyp = geraetetyp;
    }

    public List<Reservierung> getReservierungen() {
        return reservierungen;
    }

    public void setReservierungen(List<Reservierung> reservierungen) {
        this.reservierungen = reservierungen;
    }

    @Override
    public String toString() {
        return "Geraet{" +
                "gerateNr=" + gerateNr +
                ", einsatzBereit=" + einsatzBereit +
                ", reservierungen=" + reservierungen +
                '}';
    }
}
