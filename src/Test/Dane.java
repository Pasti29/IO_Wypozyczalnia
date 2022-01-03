package Test;

public class Dane {
    public String tytul[] = {"Rambo", "Spider Man", "Blade Runner", "Rambo 2", "Wolyn"};
    public String rezyser[] = {"Andrzej Wajda", "Steven Spielberg", "Woody Allen", "Ridley Scott", "Clint Eastwood"};
    public String gatunek[] = {"akcja", "komedia", "horror","tragedia","musical"};
    public int rokProdukcji[] = {1999, 2000, 1987, 2010, 2021};
    public int liczbaDostepnych[] = {0, 1, 2, 5, 15};
    public double cena[] = {20.99, 15.25, 22.33, 5.15, 4.44};

    public Film filmy[] = {
            new Film(tytul[0], rezyser[0], gatunek[0], rokProdukcji[0], liczbaDostepnych[0], cena[0]),
            new Film(tytul[1], rezyser[1], gatunek[1], rokProdukcji[1], liczbaDostepnych[1], cena[1]),
            new Film(tytul[2], rezyser[2], gatunek[2], rokProdukcji[2], liczbaDostepnych[2], cena[2]),
            new Film(tytul[3], rezyser[3], gatunek[3], rokProdukcji[3], liczbaDostepnych[3], cena[3]),
            new Film(tytul[4], rezyser[4], gatunek[4], rokProdukcji[4],liczbaDostepnych[4], cena[4]),
    };
}
