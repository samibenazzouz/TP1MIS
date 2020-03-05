package test;
import java.time.LocalDate;

import metier.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cli = new Client(1, "Benazzouz", 22, Sexe.Homme);
		if (cli != null) {
			Compte c1 = new CompteCourant(1,10000.0, LocalDate.now(),cli);
			c1.retirer(3500.0);
			System.out.println(c1.getSolde());
			c1.deposer(1200);
			System.out.println(c1.getSolde());
		}
		

	}

}
