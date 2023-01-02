package Xadrez.pecas;

import Xadrez.Cor;
import Xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Torre extends PecaXadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		
	}
	@Override
	public String toString(){
		return "T";
	}

}
