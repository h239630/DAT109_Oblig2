package no.hvl.dat109;
/**
 * Klasse for en bil
 *
 * @author Mikael Lindebrekke, Joachim D. Nilsen & Einar Åsgard
 */
public class Bil {
	
	private String registreringsNr;
	private String modell;
	private String farge;
	private Utleiegruppe utLeiegruppe;
	private int kmStand;
	private boolean ledig;
	private double pris; 
	private Utleiekontor plassertHos;
	
	/**
	 * Oppretter en bil med disse parametre.  
	 * 
	 * @param registreringsNr
	 * @param modell
	 * @param farge
	 * @param utLeiegruppe
	 * @param kmStand
	 * @param ledig
	 * @param pris
	 * @param plassertHos
	 */
	public Bil(String registreringsNr, String modell, String farge, Utleiegruppe utLeiegruppe, int kmStand, boolean ledig,
			double pris, Utleiekontor plassertHos) {
		super();
		this.registreringsNr = registreringsNr;
		this.modell = modell;
		this.farge = farge;
		this.utLeiegruppe = utLeiegruppe;
		this.kmStand = kmStand;
		this.ledig = ledig;
		this.pris = pris;
		this.plassertHos = plassertHos;
	}

	/**
	 * @return the registreringsNr
	 */
	public String getRegistreringsNr() {
		return registreringsNr;
	}

	/**
	 * @return the modell
	 */
	public String getModell() {
		return modell;
	}

	/**
	 * @return the farge
	 */
	public String getFarge() {
		return farge;
	}

	/**
	 * @return the utLeiegruppe
	 */
	public Utleiegruppe getUtLeiegruppe() {
		return utLeiegruppe;
	}

	/**
	 * @return the kmStand
	 */
	public int getKmStand() {
		return kmStand;
	}

	/**
	 * @return the ledig
	 */
	public boolean isLedig() {
		return ledig;
	}

	/**
	 * @return the pris
	 */
	public double getPris() {
		return pris;
	}

	/**
	 * @return the plassertHos
	 */
	public Utleiekontor getPlassertHos() {
		return plassertHos;
	}
	
	
	
	

}
