package application;

import models.Celular;

public class Main {
	public static void main(String[] args) {
		Celular iphone = new Celular();
		iphone.fazerLigacao();
		iphone.acessarInternet();
		iphone.tocarMusica();
	}

}
