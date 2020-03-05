package metier;

import java.time.LocalDate;

public class CompteEpargne extends Compte {
	private final static double taux= 0.05;
	@Override
	public void retirer(double montant) {
		// TODO Auto-generated method stub
			if(montant < solde) {
				solde = solde-montant;
				int lower = 1; 
				int higher = 100000; 
				int random = (int)(Math.random() * (higher-lower)) + lower;
				this.operations.add(new Versement(random, LocalDate.now(), montant));
				}
			else {
				System.out.println("operation impossible");
				}
	}

}
