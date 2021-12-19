public class Film {

	private String tytul;
	private String rezyser;
	private String gatunek;
	private int rokProdukcji;
	private int liczbaDostepnych;
	private double cena;

	/**
	 * 
	 * @param tytul
	 * @param rezyser
	 * @param gatunek
	 * @param rokProdukcji
	 * @param liczbaDostepnych
	 * @param cena
	 */
	public Film(String tytul, String rezyser, String gatunek, int rokProdukcji, int liczbaDostepnych, double cena) {
		this.tytul = tytul;
		this.rezyser = rezyser;
		this.gatunek = gatunek;
		this.rokProdukcji = rokProdukcji;
		this.liczbaDostepnych = liczbaDostepnych;
		this.cena = cena;
	}

	public String getTytul() {
		return this.tytul;
	}

	/**
	 * 
	 * @param tytul
	 */
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getRezyser() {
		return this.rezyser;
	}

	/**
	 * 
	 * @param rezyser
	 */
	public void setRezyser(String rezyser) {
		this.rezyser = rezyser;
	}

	public String getGatunek() {
		return this.gatunek;
	}

	/**
	 * 
	 * @param gatunek
	 */
	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}

	public int getRokProdukcji() {
		return this.rokProdukcji;
	}

	/**
	 * 
	 * @param rokProdukcji
	 */
	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}

	public int getLiczbaDostepnych() {
		return this.liczbaDostepnych;
	}

	/**
	 * 
	 * @param liczbaDostepnych
	 */
	public void setLiczbaDostepnych(int liczbaDostepnych) {
		this.liczbaDostepnych = liczbaDostepnych;
	}

	public double getCena() { return this.cena; }

	/**
	 * 
	 * @param cena
	 */
	public void setCena(double cena) {
		this.cena = cena;
	}

}