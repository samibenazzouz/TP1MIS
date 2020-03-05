package test;
import java.time.LocalDate;

import metier.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Client cli = new Client(1, "Benazzouz", 22, Sexe.Homme);
		if (cli != null) {
			Compte c1 = new CompteCourant(1,10000.0, LocalDate.now(),cli);
			System.out.println("Le Solde initial de "+c1.getOwner()+" est :"+c1.getSolde());
			c1.retirer(3500.0);
			System.out.println(c1.getSolde());
			c1.deposer(1200);
			System.out.println(c1.getSolde());
			System.out.println("Impression relevé:");
			c1.afficheRelever(LocalDate.now().minusDays(1), LocalDate.now().plusDays(1));
		}
		

	}

}
