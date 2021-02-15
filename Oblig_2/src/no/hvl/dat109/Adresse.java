package no.hvl.dat109;

public class Adresse {
	
	private String gate;
	private int postNr;
	private String postSted;
	
	/**
	 * Oppretter en ny adresse
	 * 
	 * @param gate
	 * @param postNr
	 * @param postSted
	 */
	public Adresse(String gate, int postNr, String postSted) {
		super();
		this.gate = gate;
		this.postNr = postNr;
		this.postSted = postSted;
	}

	/**
	 * @return the gate
	 */
	public String getGate() {
		return gate;
	}

	/**
	 * @return the postNr
	 */
	public int getPostNr() {
		return postNr;
	}

	/**
	 * @return the postSted
	 */
	public String getPostSted() {
		return postSted;
	}
	
	
	
	

}
