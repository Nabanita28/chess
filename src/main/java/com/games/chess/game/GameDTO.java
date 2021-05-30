package com.games.chess.game;

import lombok.Data;

@Data
public class GameDTO {

    Player player;
    Board board;
    Colour colour;
    Location startLocation;
    Location finishLocation;
    PieceType pieceType;
    Result result;



    public GameDTO(){
        this.board = new Board();
        this.player = Player.PLAYER1;
        this.colour = Colour.WHITE;
    }
}

