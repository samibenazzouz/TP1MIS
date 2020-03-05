package metier;

import java.time.LocalDate;

public abstract class Operation {
	@SuppressWarnings("unused")
	private int numero;
	@SuppressWarnings("unused")
	private LocalDate dateCreation;
	@SuppressWarnings("unused")
	private double montant;
	public Operation(int numero, LocalDate dateCreation, double montant) {
		super();
		this.numero = numero;
		this.dateCreation = dateCreation;
		this.montant = montant;
	}
	
	
	
	
}
