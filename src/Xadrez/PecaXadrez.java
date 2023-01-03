package Xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadrez  extends Peca{
	private Cor cor;

	public PecaXadrez(Tabuleiro Tabuleiro, Cor cor) {
		super(Tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

}
