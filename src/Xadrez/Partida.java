package Xadrez;

import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Partida {
	
	private Tabuleiro tabuleiro;

	public Partida() {
		this.tabuleiro = new Tabuleiro(8,8);
		setupInicializacao();
	}
	 
	public PecaXadrez[][] getPecas(){
		
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i++) {
			for(int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j); 
			}
		}
		return mat;
	}
	
	private void setupInicializacao() {
		tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,4));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7, 4));
	}

}
