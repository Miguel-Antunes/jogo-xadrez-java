package tabuleiro;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro Tabuleiro;
	
	public Peca(Tabuleiro Tabuleiro) {
		this.Tabuleiro = Tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return Tabuleiro;
	}

	
}
