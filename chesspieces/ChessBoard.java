package java21.chesspieces;

public class ChessBoard {
	public static void main(String[] arguments) {
		Pawn pawn = new Pawn();
		pawn.isWhite = false;
		pawn.position = "F2";
		pawn.printStatus();
		pawn.moveTo("D1");
		pawn.printStatus();
		
		System.out.println("---------");
		
		Knight knight = new Knight();
		knight.isWhite = true;
		knight.position = "F3";
		knight.printStatus();
		knight.flipHorizontal();
		knight.printStatus();
	}	
}