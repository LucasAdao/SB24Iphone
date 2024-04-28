package models;

public class Celular implements Apple {

	@Override
	public void tocarMusica() {
		System.out.println("Tocando música...");	
	}

	@Override
	public void acessarInternet() {
		System.out.println("Acessando internet...");
		
	}

	@Override
	public void fazerLigacao() {
		System.out.println("Ligando...");	
	}
	
		
	
}
