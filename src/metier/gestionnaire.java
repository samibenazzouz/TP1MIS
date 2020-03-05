package metier;

import java.time.LocalDate;
import java.util.*;

public class gestionnaire implements IGestionnaire {
	List<Compte> comptes =new ArrayList<Compte>();
	public gestionnaire() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Client saveClient(int code, String name, int Age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte saveCompte(int numero, LocalDate date, Client owner, double solde) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double consulterSolde(int compteNo) throws Exception{
		// TODO Auto-generated method stub
		Compte compteFound=null;
		for (Compte c :this.comptes) {
			if (c.getNumero()==compteNo) {
				return compteFound.getSolde();
				
			}
			
			throw new Exception("Compte introuvable");
			
		}
		return 0;
	}

	@Override
	public void printReleve(int numero, LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub

	}

}
