package java21.chesspieces;

public class Bishop extends ChessPiece {
	public Bishop() {
		forwardMovement = 1;
		sideMovement = 1;
	}

	void setSpaces(int spaces) {
		forwardMovement = spaces;
		sideMovement = spaces;
	}
}