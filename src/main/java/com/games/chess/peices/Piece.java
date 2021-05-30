package com.games.chess.peices;

import com.games.chess.game.Location;
import com.games.chess.game.Player;
import com.games.chess.game.PieceType;

public abstract class Piece {

    Player player;
    Location location;

    public Piece(Player player, Location location){
        this.player = player;
        this.location = location;
    }

    abstract boolean isValid(Location location);

    abstract int[][]  drawPath(Location start, Location finish);

    abstract PieceType getType();


}
