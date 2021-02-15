package no.hvl.dat109;

public class Kunde {
	
	private String fornavn;
	private String etternavn;
	private Adresse adresse;
	private int telefonNr;
	
	/**
	 * Oppretter en kunde
	 * 
	 * @param fornavn
	 * @param etternavn
	 * @param adresse
	 * @param telefonNr
	 */
	public Kunde(String fornavn, String etternavn, Adresse adresse, int telefonNr) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.telefonNr = telefonNr;
	}

	/**
	 * @return the fornavn
	 */
	public String getFornavn() {
		return fornavn;
	}

	/**
	 * @return the etternavn
	 */
	public String getEtternavn() {
		return etternavn;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @return the telefonNr
	 */
	public int getTelefonNr() {
		return telefonNr;
	}
	
	
	
	

}
