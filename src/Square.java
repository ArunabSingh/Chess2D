import java.io.Serializable;

/**
 * Squares on the board. Has a color (black or white), a piece, and has
 * necessary methods to keep track of each piece.
 */
public class Square implements Serializable {

	/**
	 * Serial ID.
	 */
	private static final long serialVersionUID = 1L;
	private Piece piece;
	private boolean isBlack;

	public Square() {
		this.piece = null;
	}

	/**
	 * Sets color.
	 * 
	 * @param color true for black, false for white
	 */
	public void setColor(boolean color) {
		isBlack = color;
	}

	/**
	 * Gets color.
	 * 
	 * @return true for black, false for white
	 */
	public boolean getColor() {
		return isBlack;
	}

	/**
	 * Returns piece in square.
	 * 
	 * @return current price, this square holds
	 */
	public Piece getPiece() {
		return piece;
	}

	/**
	 * Sets pieces.
	 * 
	 * @param piece the codeword of the piece
	 */

	public void setPiece(final String piece) {
		if (piece.equals("wRook")) {
			this.piece = new Rook(false);
		} else if (piece.equalsIgnoreCase("wKnight")) {
			this.piece = new Knight(false);
		} else if (piece.equalsIgnoreCase("wBishop")) {
			this.piece = new Bishop(false);
		} else if (piece.equalsIgnoreCase("wQueen")) {
			this.piece = new Queen(false);
		} else if (piece.equalsIgnoreCase("wKing")) {
			this.piece = new King(false);
		} else if (piece.equalsIgnoreCase("wPawn")) {
			this.piece = new Pawn(false);
		} else if (piece.equalsIgnoreCase("bRook")) {
			this.piece = new Rook(true);
		} else if (piece.equalsIgnoreCase("bKnight")) {
			this.piece = new Knight(true);
		} else if (piece.equalsIgnoreCase("bBishop")) {
			this.piece = new Bishop(true);
		} else if (piece.equalsIgnoreCase("bQueen")) {
			this.piece = new Queen(true);
		} else if (piece.equalsIgnoreCase("bKing")) {
			this.piece = new King(true);
		} else if (piece.equalsIgnoreCase("bPawn")) {
			this.piece = new Pawn(true);
		} else {
			this.piece = null;
		}
	}

}