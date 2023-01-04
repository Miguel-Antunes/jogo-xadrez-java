package application;

import java.util.Scanner;

import Xadrez.Partida;
import Xadrez.PecaXadrez;
import Xadrez.PosicaoXadrez;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Partida partida = new Partida();
		
		while (true) {
			InterfaceUsuario.imprimirTabuleiro(partida.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			PosicaoXadrez origem = InterfaceUsuario.lerPosicaoXadrez(sc);
			System.out.println();
			System.out.print("Destino: ");
			PosicaoXadrez destino = InterfaceUsuario.lerPosicaoXadrez(sc);
		
			PecaXadrez pecaCapturada = partida.executarJogada(origem, destino);
		
		}
		
	}

}
