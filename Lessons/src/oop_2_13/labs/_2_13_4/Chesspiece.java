package oop_2_13.labs._2_13_4;

public class Chesspiece {
	
	private ChessColor color;
	private ChessPieceKind piece;
	private int pieceKindNumber;
	
	public ChessColor getColor() {
		return color;
	}
	
	public Chesspiece(ChessColor color, ChessPieceKind piece) {
		this.color = color;
		this.piece = piece;
		
		pieceKindNumber = 1; //default value for king or queen pieces
		if(piece == ChessPieceKind.PAWN)
			pieceKindNumber = 8;
		else if (piece == ChessPieceKind.KNIGHT || 
				 piece == ChessPieceKind.BISHOP ||
				 piece == ChessPieceKind.ROOK)
		pieceKindNumber = 2;
	}
	
	@Override
	public String toString() {
		return color.name() + "_" + piece.name() + " x " + pieceKindNumber;
	}
}
