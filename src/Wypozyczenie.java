public class Wypozyczenie {

	private Klient klient;
	private Film film;
	private String dataWypozyczenia;

	/**
	 * 
	 * @param klient
	 * @param film
	 * @param dataWypozyczenia
	 */
	public Wypozyczenie(Klient klient, Film film, String dataWypozyczenia) {
		this.klient = klient;
		this.film = film;
		this.dataWypozyczenia = dataWypozyczenia;
	}

	public Klient getKlient() {
		return this.klient;
	}

	/**
	 * 
	 * @param klient
	 */
	public void setKlient(Klient klient) {
		this.klient = klient;
	}

	public Film getFilm() {
		return this.film;
	}

	/**
	 * 
	 * @param film
	 */
	public void setFilm(Film film) {
		this.film = film;
	}

	public String getDataWypozyczenia() {
		return this.dataWypozyczenia;
	}

	/**
	 * 
	 * @param dataWypozyczenia
	 */
	public void setDataWypozyczenia(String dataWypozyczenia) {
		this.dataWypozyczenia = dataWypozyczenia;
	}

}