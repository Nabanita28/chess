package com.games.chess.game;

import lombok.Data;

@Data
public class Location {

    int x;
    int y;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
}
