package com.games.chess.peices;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.games.chess.game.Colour;
import com.games.chess.game.Location;
import com.games.chess.game.Player;
import com.games.chess.game.PieceType;

import java.awt.*;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Bishop extends Piece{

    PieceType pieceType;
    Colour colour;

    public Bishop(Player player, Location location, Colour colour){
        super(player, location);
        this.pieceType = PieceType.BISHOP;
        this.colour = colour;
    }


    @Override
    public boolean isValid(Location location) {

        int x = location.getX();
        int y = location.getY();

        int x_diff = Math.abs(x - this.location.getX());
        int y_diff = Math.abs(y - this.location.getY());

        return x_diff == y_diff;
    }

    @Override
    int[][] drawPath(Location start, Location finish) {

        int pairs = finish.getY() - start.getY();

        int x_dir = 1;
        int y_dir = 1;

        if (finish.getX() - start.getX() < 0){
            x_dir = -1;
        }
        if (finish.getY() - start.getY() < 0){
            y_dir = -1;
        }

        int[][] path = new int[2][pairs-1];

        if(pairs - 1 > 0){
            for (int i=0; i<pairs-1; i++){
                path[0][i] = start.getX() + 1*x_dir;
                path[1][i] = start.getY() + 1*y_dir;
            }
        }
        return path;
    }

    @Override
    PieceType getType() {
        return PieceType.BISHOP;
    }
}
