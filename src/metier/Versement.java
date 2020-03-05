package metier;

import java.time.LocalDate;

public class Versement extends Operation{

	public Versement(int numero, LocalDate dateCreation, double montant) {
		super(numero, dateCreation, montant);
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Op[Numero: "+this.getNumero()+", Date:"+this.getDateCreation()+", Montant: "+this.getMontant()+", Type: Crédit]";
	}
	
	

	
	
	
	

}
