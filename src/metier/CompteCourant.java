package metier;


import java.time.LocalDate;
public class CompteCourant extends Compte {
		private final static double decouvertBase = 5000;
		private double decouvertReel = decouvertBase;
		
		
		


		public CompteCourant() {
			super();
			// TODO Auto-generated constructor stub
		}



		public CompteCourant(int numero, double solde, LocalDate dateCreation, Client owner) {
			super(numero, solde, dateCreation, owner);
			// TODO Auto-generated constructor stub
		}
		
		
	@Override
	
	public void retirer(double montant) throws Exception{
		
		if(solde > montant) {
			solde = solde-montant;
			int lower = 1; 
			int higher = 100000; 
			int random = (int)(Math.random() * (higher-lower)) + lower;
			this.operations.add(new Versement(random, LocalDate.now(), montant));
			
		}
		else if(montant < decouvertReel+solde) {
			double diff = montant-solde;
			decouvertReel = decouvertReel-diff;
			solde = 0;
			int lower = 1; 
			int higher = 100000; 
			int random = (int)(Math.random() * (higher-lower)) + lower;
			this.operations.add(new Versement(random, LocalDate.now(), montant));
		}
			
		else {
			throw new Exception("Operation impossible")
		}
		
	}



}
