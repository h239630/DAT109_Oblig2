package no.hvl.dat109;
/**
 * Oppretter en utleiegruppe
 *
 * @author Mikael Lindebrekke, Joachim D. Nilsen & Einar Åsgard
 */
public class Utleiegruppe {
	
	private char gruppeId;
	private String gruppeNavn;
	/**
	 * @param gruppeId
	 * @param gruppeNavn
	 */
	public Utleiegruppe(char gruppeId, String gruppeNavn) {
		super();
		this.gruppeId = gruppeId;
		this.gruppeNavn = gruppeNavn;
	}
	/**
	 * @return the gruppeId
	 */
	public char getGruppeId() {
		return gruppeId;
	}
	/**
	 * @param gruppeId the gruppeId to set
	 */
	public void setGruppeId(char gruppeId) {
		this.gruppeId = gruppeId;
	}
	/**
	 * @return the gruppeNavn
	 */
	public String getGruppeNavn() {
		return gruppeNavn;
	}
	/**
	 * @param gruppeNavn the gruppeNavn to set
	 */
	public void setGruppeNavn(String gruppeNavn) {
		this.gruppeNavn = gruppeNavn;
	} 
	
	
	

}
