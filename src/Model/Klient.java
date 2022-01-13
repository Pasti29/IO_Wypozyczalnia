package Model;

public class Klient {

	private String imie;
	private String nazwisko;
	private int rokUrodzenia;
	private int nrTelefonu;

	/**
	 * 
	 * @param imie
	 * @param nazwisko
	 * @param rokUrodzenia
	 * @param nrTelefonu
	 */
	public Klient(String imie, String nazwisko, int rokUrodzenia, int nrTelefonu) throws NumberFormatException {
		this.imie = imie;
		this.nazwisko = nazwisko;
		try {
			this.rokUrodzenia = rokUrodzenia;
		} catch (NumberFormatException e) {
			return;
		}

		this.nrTelefonu = nrTelefonu;
	}

	public String getImie() {
		return this.imie;
	}

	/**
	 * 
	 * @param imie
	 */
	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	/**
	 * 
	 * @param nazwisko
	 */
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getRokUrodzenia() {
		return this.rokUrodzenia;
	}

	/**
	 * 
	 * @param rokUrodzenia
	 */
	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}

	public int getNrTelefonu() {
		return this.nrTelefonu;
	}

	/**
	 * 
	 * @param nrTelefonu
	 */
	public void setNrTelefonu(int nrTelefonu) {
		this.nrTelefonu = nrTelefonu;
	}

}