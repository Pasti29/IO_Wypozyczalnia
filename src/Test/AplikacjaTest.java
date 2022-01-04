package Test;

import Model.Aplikacja;
import Model.Film;
import Model.Klient;
import Model.Wypozyczenie;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

import java.util.IllegalFormatCodePointException;

import static org.junit.Assert.*;

public class AplikacjaTest {

    static Dane dane;
    static Aplikacja instance;


    @Rule
    public ExpectedException exception = ExpectedException.none();

    @BeforeClass
    static public void SetUp() {
        instance = new Aplikacja();
        dane = new Dane();
    }
//
//    @org.junit.Test
//    public void szukajKlienta() {
//    }
//
//    @org.junit.Test
//    public void szukajFilmu() {
//    }
//
//    @org.junit.Test
//    public void szukajWypozyczenia() {
//    }

    @org.junit.Test
    public void dodajKlienta() {
        System.out.println("dodajKlienta");
        for (int i = 0; i < 4; i++) {
            //System.out.println(i);
            instance.dodajKlienta(dane.imie[i], dane.nazwisko[i], dane.rokUrodzenia[i], dane.nrTelefonu[i]);
            Klient klient = instance.szukajKlienta(dane.klienci[i].getImie(), dane.klienci[i].getNazwisko());
            assertEquals(dane.klienci[i].getImie(), klient.getImie());
            assertEquals(dane.klienci[i].getNazwisko(), klient.getNazwisko());
            assertEquals(dane.klienci[i].getRokUrodzenia(), klient.getRokUrodzenia());
            assertEquals(dane.klienci[i].getNrTelefonu(), klient.getNrTelefonu());
        }
        exception.expect(IllegalFormatCodePointException.class);
        exception.expectMessage("Code = 0x0");
        instance.dodajKlienta(dane.imie[0], dane.nazwisko[0], dane.rokUrodzenia[0], dane.nrTelefonu[0]);

    }

    @org.junit.Test
    public void dodajFilm() {
        System.out.println("dodajFilm");
        for (int i = 0; i < 5; i++) {
            instance.dodajFilm(dane.tytul[i], dane.rezyser[i], dane.gatunek[i], dane.rokProdukcji[i], dane.liczbaDostepnych[i], dane.cena[i]);
            Film film = instance.szukajFilmu(dane.tytul[i], dane.rezyser[i]);
            assertEquals(dane.filmy[i].getTytul(), film.getTytul());
            assertEquals(dane.filmy[i].getRezyser(), film.getRezyser());
            assertEquals(dane.filmy[i].getGatunek(), film.getGatunek());
            assertEquals(dane.filmy[i].getRokProdukcji(), film.getRokProdukcji());
            assertEquals(dane.filmy[i].getLiczbaDostepnych(), film.getLiczbaDostepnych());
        }
        exception.expect(IllegalFormatCodePointException.class);
        exception.expectMessage("Code = 0x0");
        instance.dodajFilm(dane.tytul[0], dane.rezyser[0], dane.gatunek[0], dane.rokProdukcji[0], dane.liczbaDostepnych[0], dane.cena[0]);
    }

    @org.junit.Test
    public void dodajWypozyczenie() {

        System.out.println("dodajWypozyczenie");
        for (int i = 0; i < 2; i++) {
            instance.dodajKlienta(dane.imie[i], dane.nazwisko[i], dane.rokUrodzenia[i], dane.nrTelefonu[i]);
            instance.dodajFilm(dane.tytul[i], dane.rezyser[i], dane.gatunek[i], dane.rokProdukcji[i], dane.liczbaDostepnych[i], dane.cena[i]);
            instance.dodajWypozyczenie(dane.imie[i], dane.nazwisko[i], dane.tytul[i], dane.rezyser[i], "2022-01-03");
            Wypozyczenie wyp = instance.szukajWypozyczenia(instance.szukajKlienta(dane.imie[i], dane.nazwisko[i]), instance.szukajFilmu(dane.tytul[i], dane.rezyser[i]), "2022-01-03");
            assertEquals(dane.wypozyczenia[i].getKlient().getImie(), wyp.getKlient().getImie());
            assertEquals(dane.wypozyczenia[i].getFilm().getTytul(), wyp.getFilm().getTytul());
            assertEquals(dane.wypozyczenia[i].getDataWypozyczenia(), wyp.getDataWypozyczenia());

        }
        exception.expect(IllegalFormatCodePointException.class);
        exception.expectMessage("Code = 0x0");
        instance.dodajWypozyczenie(dane.imie[0], dane.nazwisko[0], dane.tytul[0], dane.rezyser[0], "2022-01-03");

    }
//
//    @org.junit.Test
//    public void przyjmijZwrot() {
//    }
//
//    @org.junit.Test
//    public void przegladanieFimow() {
//    }
//
//    @org.junit.Test
//    public void aktualizacjaWypozyczen() {
//    }
//
//    @org.junit.Test
//    public void aktualizacjaLiczbyFilmow() {
//    }
//
//    @org.junit.Test
//    public void main() {
//    }
//
}