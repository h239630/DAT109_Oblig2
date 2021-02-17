/**
 * 
 */
package no.hvl.dat109;

import java.util.List;

/**
 *
 * @author Mikael Lindebrekke, Joachim D. Nilsen & Einar Åsgard
 */
public class BilRegister {
	
	List<Bil> bilRegister;

	/**
	 * @param bilRegister
	 */
	public BilRegister(List<Bil> bilRegister) {
		super();
		this.bilRegister = bilRegister;
	}

	/**
	 * @return the bilRegister
	 */
	public List<Bil> getBilRegister() {
		return bilRegister;
	}
	/**
	 * Legger til en ny bil i registreret
	 */
	public void leggTilBil(Bil bil) {
		bilRegister.add(bil);
	}
	
}
