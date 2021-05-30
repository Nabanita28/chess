package com.games.chess.game;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.games.chess.peices.Piece;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class GameDTO {

    Player player;
    Piece[][] board;
    Colour colour;
    Location startLocation;
    Location finishLocation;
    PieceType pieceType;
    Result result;



    public GameDTO(){
        this.board = new Piece[8][8];
        this.player = Player.PLAYER1;
        this.colour = Colour.WHITE;
    }
}

