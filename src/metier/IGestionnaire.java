package metier;

import java.time.LocalDate;

public interface IGestionnaire {
	public Client saveClient(int code, String name, int Age);
	public Compte saveCompte(int numero,LocalDate date, Client owner, double solde);
	public double consulterSolde(int compteNo) throws Exception;
	public void printReleve(int numero,LocalDate from,LocalDate to);
	
}
