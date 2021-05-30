package com.games.chess.game;

public enum PieceType {
    BISHOP("BISHOP"), KING("KING"), KNIGHT("KNIGHT"), PAWN("PAWN"), QUEEN("QUEEN"), ROOK("ROOK");

    public final String value;

    PieceType(String value) {
        this.value = value;
    }

    String getPieceType() {
        return this.value;
    }
}
