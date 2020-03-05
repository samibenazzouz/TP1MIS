package metier;

import java.time.LocalDate;
import java.util.*;

public abstract class Compte {
	private int numero;
	protected double  solde;
	private LocalDate dateCreation;
	private Client owner;
	protected List<Operation> operations = new ArrayList<Operation>();
	
	public abstract void retirer(double montant) throws Exception;
	
	public void deposer(double montant) {
		this.solde = this.solde + montant;
		// Generer un entier aleatoire entre 1 et 100000
		int lower = 1; 
		int higher = 100000; 
		int random = (int)(Math.random() * (higher-lower)) + lower;
		this.operations.add(new Versement(random, LocalDate.now(), montant));
		
	}
	
	public Compte(int numero, double solde, LocalDate dateCreation, Client owner) {
		
		super();
		this.numero = numero;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.owner = owner;
	}
	
	public Compte() {
		super();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Client getOwner() {
		return owner;
	}
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	
}
