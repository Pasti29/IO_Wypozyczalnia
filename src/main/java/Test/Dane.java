package Test;

import Model.Film;
import Model.Klient;
import Model.Wypozyczenie;

public class Dane {
    public String[] tytul = {"Rambo", "Spider Man", "Blade Runner", "Rambo 2", "Wolyn", "Pan Tadeusz", "Transformers"};
    public String[] rezyser = {"Andrzej Wajda", "Steven Spielberg", "Woody Allen", "Ridley Scott", "Clint Eastwood", "Andrzej Wajda", "Michael Bay"};
    public String[] gatunek = {"akcja", "komedia", "horror", "tragedia", "musical", "akcja", "akcja"};
    public int[] rokProdukcji = {1999, 2000, 1987, 2010, 2021, 1999, 2012};
    public int[] liczbaDostepnych = {0, 1, 2, 5, 15, 10, 15};
    public double[] cena = {20.99, 15.25, 22.33, 5.15, 4.44, 9.99, 4,99};

    public Film[] filmy = {
            new Film(tytul[0], rezyser[0], gatunek[0], rokProdukcji[0], liczbaDostepnych[0], cena[0]),
            new Film(tytul[1], rezyser[1], gatunek[1], rokProdukcji[1], liczbaDostepnych[1], cena[1]),
            new Film(tytul[2], rezyser[2], gatunek[2], rokProdukcji[2], liczbaDostepnych[2], cena[2]),
            new Film(tytul[3], rezyser[3], gatunek[3], rokProdukcji[3], liczbaDostepnych[3], cena[3]),
            new Film(tytul[4], rezyser[4], gatunek[4], rokProdukcji[4], liczbaDostepnych[4], cena[4]),
            new Film(tytul[5], rezyser[5], gatunek[5], rokProdukcji[5], liczbaDostepnych[5], cena[5]),
            new Film(tytul[6], rezyser[6], gatunek[6], rokProdukcji[6], liczbaDostepnych[6], cena[6])
    };


    public String[] imie = {"Bartosz", "Kajetan", "Julia", "Ryszard", "Henryk", "Karol", "Mateusz"};
    public String[] nazwisko = {"Sernicki", "Rejtan", "Zebra", "Mickiewicz", "Kowalski", "Musial", "Wasilewski"};
    public int[] rokUrodzenia = {1999, 2000, 1987, 2000, 1950, 1999, 2000};
    public int[] nrTelefonu = {123456789, 123450987, 123123123, 123123321, 456123631, 789123543, 673897654};
    public Klient[] klienci = {
            new Klient(imie[0], nazwisko[0], rokUrodzenia[0], nrTelefonu[0]),
            new Klient(imie[1], nazwisko[1], rokUrodzenia[1], nrTelefonu[1]),
            new Klient(imie[2], nazwisko[2], rokUrodzenia[2], nrTelefonu[2]),
            new Klient(imie[3], nazwisko[3], rokUrodzenia[3], nrTelefonu[3]),
            new Klient(imie[4], nazwisko[4], rokUrodzenia[4], nrTelefonu[4]),
            new Klient(imie[5], nazwisko[5], rokUrodzenia[5], nrTelefonu[5]),
            new Klient(imie[6], nazwisko[6], rokUrodzenia[6], nrTelefonu[6])
    };

    public Wypozyczenie[] wypozyczenia = {
            new Wypozyczenie(klienci[5], filmy[5], "2022-01-03"),
            new Wypozyczenie(klienci[6], filmy[6], "2022-01-03")
    };
}
