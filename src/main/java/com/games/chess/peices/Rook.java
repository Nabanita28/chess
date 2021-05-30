package com.games.chess.peices;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.games.chess.game.Colour;
import com.games.chess.game.Location;
import com.games.chess.game.PieceType;
import com.games.chess.game.Player;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Rook extends Piece{

    PieceType pieceType;
    Colour colour;

    public Rook(Player player, Location location, Colour colour){
        super(player, location);
        this.pieceType = PieceType.ROOK;
        this.colour = colour;
    }

    @Override
    boolean isValid(Location location) {
        return false;
    }

    @Override
    int[][] drawPath(Location start, Location finish) {
        return new int[0][];
    }

    @Override
    PieceType getType() {
        return PieceType.ROOK;
    }
}
