package java21.chesspieces;

public class Knight extends ChessPiece {
	public Knight() {
		forwardMovement = 3;
		sideMovement = 2;
	}
		
	void horizontal() {
		int forwardTemp = forwardMovement;
		forwardMovement = sideMovement;
		sideMovement = forwardTemp;
	}

	void flipHorizontal() {
		sideMovement = -sideMovement;
	}

	void flipVertical() {
		forwardMovement = -forwardMovement;
	}
}