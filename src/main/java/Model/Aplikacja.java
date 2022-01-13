package Model;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class Aplikacja  {

    private ArrayList<Klient> klienci = new ArrayList<>();
    private ArrayList<Film> filmy = new ArrayList<>();
    private ArrayList<Wypozyczenie> wypozyczenia = new ArrayList<>();

    /**
     * @param imie
     * @param nazwisko
     */
    public Klient szukajKlienta(String imie, String nazwisko) {
        for (int i = 0; i < klienci.size(); i++) {
            if (klienci.get(i).getImie().equals(imie) && klienci.get(i).getNazwisko().equals(nazwisko)) {
                return klienci.get(i);
            }
        }
        return null;
    }

    /**
     * @param tytul
     * @param rezyser
     */
    public Film szukajFilmu(String tytul, String rezyser) {
        for (int i = 0; i < filmy.size(); i++) {
            if (filmy.get(i).getTytul().equals(tytul) && filmy.get(i).getRezyser().equals(rezyser)) {
                return filmy.get(i);
            }
        }
        return null;
    }

    /**
     * @param klient
     * @param film
     */
    public Wypozyczenie szukajWypozyczenia(Klient klient, Film film, String dataWypozyczenia) {
        for (int i = 0; i < wypozyczenia.size(); i++) {
            if (wypozyczenia.get(i).getKlient() == klient && wypozyczenia.get(i).getFilm() == film && wypozyczenia.get(i).getDataWypozyczenia().equals(dataWypozyczenia)) {
                return wypozyczenia.get(i);
            }
        }
        return null;
    }

    /**
     * @param imie
     * @param nazwisko
     * @param rokUrodzenia
     * @param nrTelefonu
     */
    public void dodajKlienta(String imie, String nazwisko, int rokUrodzenia, int nrTelefonu) {
        if (szukajKlienta(imie, nazwisko) == null) {
            Klient klient = new Klient(imie, nazwisko, rokUrodzenia, nrTelefonu);
            klienci.add(klient);
        } else throw new IllegalFormatCodePointException(0);
    }

    /**
     * @param tytul
     * @param rezyser
     * @param gatunek
     * @param rokProdukcji
     * @param liczbaDostepnych
     * @param cena
     */
    public void dodajFilm(String tytul, String rezyser, String gatunek, int rokProdukcji, int liczbaDostepnych, double cena) {
        if (szukajFilmu(tytul, rezyser) == null) {
            Film film = new Film(tytul, rezyser, gatunek, rokProdukcji, liczbaDostepnych, cena);
            filmy.add(film);
        } else throw new IllegalFormatCodePointException(0);
    }

    public void dodajWypozyczenie(String imie, String nazwisko, String tytul, String rezyser, String dataWypozyczenia) {
        Klient klient;
        if ((klient = szukajKlienta(imie, nazwisko)) != null) {
            if(!mozeWypozyczyc(klient)) throw new IllegalFormatCodePointException(0);
            Film film;
            if ((film = szukajFilmu(tytul, rezyser)) != null) {
                if ((szukajWypozyczenia(klient, film, dataWypozyczenia)) == null) {
                    Wypozyczenie wypozyczenie = new Wypozyczenie(klient, film, dataWypozyczenia);
                    aktualizacjaWypozyczen(wypozyczenie, true);
                    aktualizacjaLiczbyFilmow(tytul, rezyser, -1);
                } else throw new IllegalFormatCodePointException(0);
            } else throw new IllegalFormatCodePointException(0);
        } else throw new IllegalFormatCodePointException(0);
    }

    public void przyjmijZwrot(String imie, String nazwisko, String tytul, String rezyser, String dataWypozyczenia) {
        Klient klient;
        if ((klient = szukajKlienta(imie, nazwisko)) != null) {
            Film film;
            if ((film = szukajFilmu(tytul, rezyser)) != null) {
                Wypozyczenie wypozyczenie;
                if ((wypozyczenie = szukajWypozyczenia(klient, film, dataWypozyczenia)) != null) {
                    aktualizacjaWypozyczen(wypozyczenie, false);
                    aktualizacjaLiczbyFilmow(tytul, rezyser, 1);
                }
            }
        }
    }

    /**
     * @param rezyser
     * @param gatunek
     * @param rokProdukcji
     * @param cena
     */
    public void przegladanieFimow(String rezyser, String gatunek, String rokProdukcji, double cena) {
        // TODO - implement Model.Aplikacja.przegladanieFimow
        throw new UnsupportedOperationException();
    }

    /**
     * @param wypozyczenie
     * @param operacja
     */
    public void aktualizacjaWypozyczen(Wypozyczenie wypozyczenie, boolean operacja) {
        if (operacja) {
            wypozyczenia.add(wypozyczenie);
        } else {
            wypozyczenia.remove(wypozyczenie);
        }
    }

    /**
     * @param tytul
     * @param rezyser
     * @param ilosc
     */
    public void aktualizacjaLiczbyFilmow(String tytul, String rezyser, int ilosc) {
        Film film;
        if ((film = szukajFilmu(tytul, rezyser)) != null) {
            film.setLiczbaDostepnych(film.getLiczbaDostepnych() + ilosc);
        } else {
            System.out.print("Model.Film nie istnieje!");
        }
    }

    public boolean mozeWypozyczyc(Klient klient) {
        for (Wypozyczenie wypozyczenie: wypozyczenia) {
            if (wypozyczenie.getKlient() == klient)
                return false;
        }
        return true;
    }

    public ArrayList<Klient> getKlienci() { return klienci;}
    public ArrayList<Film> getFilmy() { return filmy;}
    public ArrayList<Wypozyczenie> getWypozyczenia() { return wypozyczenia;}

    /**
     * @param args
     */
    public void main(String[] args) {
        // TODO - implement Model.Aplikacja.main
        throw new UnsupportedOperationException();
    }
}