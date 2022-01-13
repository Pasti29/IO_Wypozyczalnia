package fitnesse;
import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;

public class TestDodajKlienta extends ColumnFixture {
    String imie;
    String nazwisko;
    int rokUrodzenia;
    int nrTelefonu;

    public boolean dodajKlienta() throws IllegalFormatCodePointException {
        int s1 = liczbaKlientow();
        try {
            SetUp.aplikacja.dodajKlienta(imie, nazwisko, rokUrodzenia, nrTelefonu);
            int s2 = liczbaKlientow();
            return s1 != s2;
        } catch (IllegalFormatCodePointException e ) {
            return false;
        }

    }

    public int liczbaKlientow() {
        return SetUp.aplikacja.getKlienci().size();
    }
}
