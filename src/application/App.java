package application;

import Xadrez.Partida;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tabuleiro tabuleiro = new Tabuleiro(8,8);
		
		Partida partida = new Partida();
		InterfaceUsuario.imprimirTabuleiro(partida.getPecas());
	}

}
