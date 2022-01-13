package fitnesse;
import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;

public class TestDodajFilm extends ColumnFixture{
    String tytul;
    String rezyser;
    String gatunek;
    int rokProdukcji;
    int liczbaDostepnych;
    double cena;

    public boolean dodajFilm() throws IllegalFormatCodePointException {
        int s1 = liczbaFilmow();
        try {
            SetUp.aplikacja.dodajFilm(tytul, rezyser, gatunek, rokProdukcji, liczbaDostepnych, cena);
            int s2 = liczbaFilmow();
            return s1 != s2;
        } catch (IllegalFormatCodePointException e ) {
            return false;
        }

    }

    public int liczbaFilmow() {
        return SetUp.aplikacja.getFilmy().size();
    }
}
