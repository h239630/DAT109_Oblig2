package no.hvl.dat109;

/**
 * En klasse for et bilutleierselskap
 * 
 * @author Mikael Lindebrekke, Joachim D. Nilsen & Einar Åsgard
 */

public class Bilutleieselskap {
	
	private String navn;
	private int telefonNr;
	private Adresse adresse;
	
	/**
	 * Oppretter et bilutleieselskap
	 * @param navn
	 * @param telefon
	 * @param adresse
	 */
	
	public Bilutleieselskap(String navn, int telefon, Adresse adresse) {
		super();
		this.navn = navn;
		this.telefonNr = telefon;
		this.adresse = adresse;
	}

	/**
	 * @return navn
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * @return telefon
	 */
	public int getTelefon() {
		return telefonNr;
	}

	/**
	 * @return adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	
	
}
