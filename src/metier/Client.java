package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private int code;
	private String name;
	private int age;
	private Sexe genre;
		
	
	public Client(int code, String name, int age, Sexe genre) {
		super();
		this.code = code;
		this.name = name;
		this.age = age;
		this.genre = genre;
	}
	public Client() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}
