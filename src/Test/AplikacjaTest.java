package Test;

import Model.Aplikacja;
import Model.Film;
import org.junit.Before;
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

    @org.junit.Test
    public void szukajKlienta() {
    }

    @org.junit.Test
    public void szukajFilmu() {
    }

    @org.junit.Test
    public void szukajWypozyczenia() {
    }

    @org.junit.Test
    public void dodajKlienta() {
    }

    @org.junit.Test
    public void dodajFilm() {
        System.out.println("dodajFilm");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            instance.dodajFilm(dane.tytul[i], dane.rezyser[i], dane.gatunek[i], dane.rokProdukcji[i], dane.liczbaDostepnych[i], dane.cena[i]);
            System.out.println(instance.szukajFilmu(dane.filmy[i].getTytul(), dane.filmy[i].getRezyser()));
            assertEquals(dane.filmy[i], instance.szukajFilmu(dane.filmy[i].getTytul(), dane.filmy[i].getRezyser()));
        }
        //instance.szukajFilmu(dane.filmy[i].getTytul(), dane.filmy[i].getRezyser()))
        exception.expect(IllegalFormatCodePointException.class);
        exception.expectMessage("Code = 0x0");
        //instance.dodajFilm(dane.tytul[0], dane.rezyser[0], dane.gatunek[0], dane.rokProdukcji[0], dane.liczbaDostepnych[0], dane.cena[0]);
    }

    @org.junit.Test
    public void dodajWypozyczenie() {
    }

    @org.junit.Test
    public void przyjmijZwrot() {
    }

    @org.junit.Test
    public void przegladanieFimow() {
    }

    @org.junit.Test
    public void aktualizacjaWypozyczen() {
    }

    @org.junit.Test
    public void aktualizacjaLiczbyFilmow() {
    }

    @org.junit.Test
    public void main() {
    }
}