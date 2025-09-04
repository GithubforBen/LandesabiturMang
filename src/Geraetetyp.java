import java.util.*;

public class Geraetetyp {
    private int geraeterypNr;
    private String bezeichnung;
    private LinkedList<Geraet> geraete;

    public Geraetetyp(int geraeterypNr, String bezeichnung) {
        this.geraeterypNr = geraeterypNr;
        this.bezeichnung = bezeichnung;
        this.geraete = new LinkedList<>();
    }
    public void erfasseGeraet(){
        geraete.add(new Geraet(this));
    }

    public Geraet sucheFreiesGeraet(Date von, Date bis){
        for (int i = 0; i < geraete.size(); i++) {
            if(geraete.get(i).istFrei(von, bis)){
                if(geraete.get(i).isEinsatzBereit()){
                    return geraete.get(i);
                }
            }
        }
        return null;
    }

    public int getGeraeterypNr() {
        return geraeterypNr;
    }

    public void setGeraeterypNr(int geraeterypNr) {
        this.geraeterypNr = geraeterypNr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public LinkedList<Geraet> getGeraete() {
        return geraete;
    }

    public void setGeraete(LinkedList<Geraet> geraete) {
        this.geraete = geraete;
    }

    @Override
    public String toString() {
        return "Geraetetyp{" +
                "geraeterypNr=" + geraeterypNr +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", geraete=" + geraete +
                '}';
    }
}
