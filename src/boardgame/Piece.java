package boardgame;

public class Piece {
	
	
	// � uma posicao de de matriz, e nao de xadrez.
	protected Position position;
	
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// somente classes de um mesmo pacote e subclasses poderam acessar o board de uma pe�a.
	protected Board getBoard() {
		return board;
	}
	
}
