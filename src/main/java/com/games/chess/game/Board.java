package com.games.chess.game;

import lombok.Data;

@Data
public class Board {
    int[][] board ;

    public Board(){
       this.board = new int[8][8];
    }
}
