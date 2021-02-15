package no.hvl.dat109;
/**
 * En klasse for et utleiekontor
 *
 * @author Mikael Lindebrekke, Joachim D. Nilsen & Einar Åsgard
 */
public class Utleiekontor {
	
	private int kontorNr;
	private String navn;
	private int telefonNr;
	private Adresse Adresse;
	
	
	/**
	 * Oppretter et utleiekontor
	 * @param kontorNr
	 * @param navn
	 * @param telefonNr
	 * @param adresse
	 */
	public Utleiekontor(int kontorNr, String navn, int telefonNr, no.hvl.dat109.Adresse adresse) {
		super();
		this.kontorNr = kontorNr;
		this.navn = navn;
		this.telefonNr = telefonNr;
		Adresse = adresse;
	}

	/**
	 * @return the kontorNr
	 */
	public int getKontorNr() {
		return kontorNr;
	}

	/**
	 * @return the navn
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * @return the telefonNr
	 */
	public int getTelefonNr() {
		return telefonNr;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return Adresse;
	}
	
	
}
