package com.games.chess.game;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.games.chess.peices.*;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Board {
    Piece[][] board ;

    public Board(){
       this.board = new Piece[8][8];
    }


}
