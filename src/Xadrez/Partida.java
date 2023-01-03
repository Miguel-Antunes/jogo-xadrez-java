package Xadrez;

import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;
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
	private void lugarNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.lugarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}
	private void setupInicializacao() {
		lugarNovaPeca('b', 6, new Torre(tabuleiro, Cor.BRANCO));
		lugarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
		lugarNovaPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));
	
		
	}

}
