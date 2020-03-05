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
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	
	
}
