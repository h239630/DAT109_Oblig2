package no.hvl.dat109;

public class testMain {
	
	public static void main(String[] args) {
		Adresse adresse = new Adresse("Thorsgate 3", 5000, "Bergen");
		Utleiekontor bergen = new Utleiekontor(1, "Bergen", 11223344, adresse);
		Utleiegruppe a = new Utleiegruppe('A', "Liten");
		Bil testbil = new Bil("AB12345", "Ford", "Gul", a, 140000, false, 99, bergen);
		
		
	}

}
