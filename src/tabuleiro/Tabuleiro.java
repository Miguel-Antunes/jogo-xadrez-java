package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca [] [] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		
		if(linhas < 1 || colunas < 1) {
			throw new ExcessaoTabuleiro("Erro ao criar Tabuleiro. É necessário pelo menos 1 linha e 1 coluna!");
		}
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
		
	}

	public int getLinhas() {
		return linhas;
	}


	public int getColunas() {
		return colunas;
	}

	
	public Peca peca(int linha, int coluna) {
		if(!posicaoExistente(linha, coluna)) {
			throw new ExcessaoTabuleiro("Posição não encontrada no Tabuleiro!");
		}
		return pecas[linha][coluna]; 
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new ExcessaoTabuleiro("Posição não encontrada no Tabuleiro!");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()]; 
	}
	
	public void lugarPeca(Peca peca, Posicao posicao) {
		if(temPeca(posicao)) {
			throw new ExcessaoTabuleiro("Já existe uma peça na posição: "+ posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
		
	}
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >=0 && linha < this.linhas && coluna >=0 && coluna < this.colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temPeca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new ExcessaoTabuleiro("Posição não encontrada no Tabuleiro!");
		}
		return peca(posicao) != null;
	}
	
}
