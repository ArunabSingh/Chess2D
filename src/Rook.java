/**
 * Rook piece class.
 * 
 * @author Singh, Arunab
 * @version 1.0
 */
public class Rook extends Piece {

	private String image;
	private boolean black;

	/**
	 * Constructs Piece and sets Image based on color.
	 * 
	 * @param black true if piece is black.
	 */
	public Rook(final boolean black) {
		this.black = black;

		System.out.println(this.getClass().getResource("/images/bRook.png").getPath());
		if (black) {
			image = this.getClass().getResource("/images/bRook.png").getPath();
		} else {
			image = this.getClass().getResource("/images/wRook.png").getPath();
		}
	}

	/**
	 * returns piece.
	 * 
	 * @return code word of piece
	 */
	public String getPiece() {
		if (black) {
			return "bRook";
		} else {
			return "wRook";
		}
	}

	/**
	 * Return image path of this piece.
	 * 
	 * @return the image path
	 */
	public String getImagePath() {
		return image;
	}

	/**
	 * Returns color of the piece.
	 * 
	 * @return color of the piece
	 */
	public String getColor() {

		if (black) {
			return "black";
		} else {
			return "white";
		}
	}

	/**
	 * Checks if move is valid.
	 * 
	 * @param currentPosId current position
	 * @param moveToId     move to position
	 */
	public boolean isValidMove(String currentPosId, String moveToId) {
		int[] currentPos = getX_Y(currentPosId);
		int[] moveTo = getX_Y(moveToId);
		if (currentPos[0] == moveTo[0] && checkIfPathClear(currentPos, moveTo, 1)) { // in testing atm
			System.out.println("left and right");
			return true;
		} else if (currentPos[1] == moveTo[1] && checkIfPathClear(currentPos, moveTo, 0)) {
			System.out.println("up and down");
			return true;
		} else {
			return false;
		}
	}

	public boolean isValidKill(String currentPos, String moveTo, String color) {
		return true;
	};

	/**
	 * Checks if Path is clear.
	 * 
	 * @param currentPos first position
	 * @param moveTo     moveto position
	 * @param xy         checks direction
	 * @return if path is clear
	 */
	protected boolean checkIfPathClear(int[] currentPos, int[] moveTo, int xy) {
		int stepCount;
		stepCount = moveTo[xy] - currentPos[xy];
		System.out.println(stepCount + " XY: " + xy);
		return checkInDirectionStraight(stepCount, getVector(stepCount), xy, currentPos, false);
	}
}