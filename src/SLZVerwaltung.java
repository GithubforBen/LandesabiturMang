import java.util.*;

public class SLZVerwaltung {
    private LinkedList<Geraetetyp> typen;
    private LinkedList<Reservierung> reservierungen;
    private LinkedList<Schueler> schueler;

    public SLZVerwaltung(){
        typen = new LinkedList<>();
        reservierungen = new LinkedList<>();
        schueler = new LinkedList<>();
    }

    public Schueler sucheSchueler(int ausweisNR){
        for (int i = 0; i < schueler.size(); i++) {
            if(schueler.get(i).getAusweisNr() == ausweisNR){
                return schueler.get(i);
            }
        }
        return null;
    }

    public Geraet sucheFreiesGeraetVonTyp(int typNr, Date von, Date bis){
        for (int i = 0; i < typen.size(); i++) {
            if(typen.get(i).getGeraeterypNr() == typNr){
                return typen.get(i).sucheFreiesGeraet(von, bis);
            }
        }
        return null;
    }

    public Reservierung reservieren(int typNr, Date von, Date bis, Schueler schueler){
        reservierungen.add(new Reservierung(von, bis, sucheFreiesGeraetVonTyp(typNr, von, bis), schueler));
        return reservierungen.getLast();
    }

    public Reservierung sucheReservierung(int resNr) {
        for (int i = 0; i < reservierungen.size(); i++) {
            if(reservierungen.get(i).getReservierungsNr() == resNr){
                return reservierungen.get(i);
            }
        }
        return null;
    }

    public LinkedList<Geraetetyp> getTypen() {
        return typen;
    }

    public void setTypen(LinkedList<Geraetetyp> typen) {
        this.typen = typen;
    }

    public LinkedList<Reservierung> getReservierungen() {
        return reservierungen;
    }

    public void setReservierungen(LinkedList<Reservierung> reservierungen) {
        this.reservierungen = reservierungen;
    }

    public LinkedList<Schueler> getSchueler() {
        return schueler;
    }

    public void setSchueler(LinkedList<Schueler> schueler) {
        this.schueler = schueler;
    }

    @Override
    public String toString() {
        return "SLZVerwaltung{" +
                "typen=" + typen +
                ", reservierungen=" + reservierungen +
                ", schueler=" + schueler +
                '}';
    }
}

