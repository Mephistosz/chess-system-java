package application;

import java.util.Scanner;

import boardgame.BoardException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			ChessMatch chessMatch = new ChessMatch();
			while (true) {
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
			}
		} catch (BoardException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
