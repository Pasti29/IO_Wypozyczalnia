package fitnesse;
import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;

public class TestDodajWypozyczenie extends ColumnFixture{
    String imie;
    String nazwisko;
    String tytul;
    String rezyser;
    String dataWypozyczenia;

    public boolean dodajWypozyczenie() throws IllegalFormatCodePointException {
        int s1 = liczbaWypozyczen();
        try {
            SetUp.aplikacja.dodajWypozyczenie(imie, nazwisko, tytul, rezyser, dataWypozyczenia);
            int s2 = liczbaWypozyczen();
            return s1 != s2;
        } catch (IllegalFormatCodePointException e ) {
            return false;
        }

    }

    public int liczbaWypozyczen() {
        return SetUp.aplikacja.getWypozyczenia().size();
    }
}
