package no.hvl.dat109;

import java.util.Date;
/**
 * Klasse for reservasjon
 *
 * @author Mikael Lindebrekke, Joachim D. Nilsen & Einar Åsgard
 */
public class Reservasjon {
	String kredittKortNr;
	String regNr;
	int kmStand;
	Date utleie;
	Date retur;

	/**
	 * Oppretter en reservasjon
	 * 
	 * @param kredittKortNr
	 * @param regNr
	 * @param kmStand
	 * @param utleie
	 * @param retur
	 */
	public Reservasjon(String kredittKortNr, String regNr, int kmStand, Date utleie, Date retur) {
		super();
		this.kredittKortNr = kredittKortNr;
		this.regNr = regNr;
		this.kmStand = kmStand;
		this.utleie = utleie;
		this.retur = retur;
	}

	/**
	 * @return the kredittKortNr
	 */
	public String getKredittKortNr() {
		return kredittKortNr;
	}

	/**
	 * @return the regNr
	 */
	public String getRegNr() {
		return regNr;
	}

	/**
	 * @return the kmStand
	 */
	public int getKmStand() {
		return kmStand;
	}

	/**
	 * @return the utleie
	 */
	public Date getUtleie() {
		return utleie;
	}

	/**
	 * @return the retur
	 */
	public Date getRetur() {
		return retur;
	}
	

}
