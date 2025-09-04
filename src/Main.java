import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SLZVerwaltung slzVerwaltung = new SLZVerwaltung();
        Schueler schueler = new Schueler(0, "Wolf", "Timo");
        slzVerwaltung.getSchueler().add(schueler);
        Geraetetyp geraetetyp = new Geraetetyp(1, "PC");
        slzVerwaltung.getTypen().add(geraetetyp);
        slzVerwaltung.reservieren(1, new Date(11,9,2001), new Date(11,9,2002), schueler);
        System.out.print(slzVerwaltung);
    }
}