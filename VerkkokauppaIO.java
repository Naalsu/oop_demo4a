import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Luokkaa käytetään verkkokaupan tietojen tallentamiseen
 * ja lataamiseen tietovarastosta.
 *
 * @author Erkki
 */
public class VerkkokauppaIO {

    public static void main(String[] args) {
        ArrayList<Asiakas> al = new ArrayList<>();
        al.add(new Asiakas("12345", "Antti Asiakas", 10));
        al.add(new Asiakas("54321", "Anna Asiakas", 55.50));
        al.add(new Asiakas("99999", "Keijo Keksitty", 1000));
        kirjoitaAsiakkaat(al, "asiakkaat.csv");
    }

    private static final String EROTIN = ";";

    public static void kirjoitaTiedosto(String tiedostonimi,
                                        String sisalto) {
        try (PrintWriter tiedosto = new PrintWriter(tiedostonimi)){
            tiedosto.write(sisalto);
        } catch (FileNotFoundException e) {
            System.out.println("Tapahtui virhe: " + e);
        }
    }

    public static void kirjoitaAsiakkaat(ArrayList<Asiakas> asiakasLista,
                                         String tiedostonNimi) {
        String data = "";
        for (Asiakas asiakas : asiakasLista) {
            data += asiakas.getData(VerkkokauppaIO.EROTIN);
            data += "\n";
        }
        // Poistetaan viimeinen "turha" rivinvaihto
        if (data.length() > 0) {
            data = data.substring(0, data.length() - 1);
        }
        kirjoitaTiedosto(tiedostonNimi, data);
    }
}
