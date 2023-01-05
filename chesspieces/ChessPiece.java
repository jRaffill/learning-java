package java21.chesspieces;

public class ChessPiece {
	int forwardMovement;
	int sideMovement;
		
	String position;
	String type;
	Boolean isWhite;
	
	void moveTo(String newPosition) {
		position = newPosition;
		System.out.println("moved to " + newPosition);
	}
	
	void printStatus() {
		System.out.println("current position: " + position);
		System.out.println("forward movement: " + forwardMovement);
		System.out.println("side movement: " + sideMovement);

	}
}