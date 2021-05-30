package com.games.chess.service;

import com.games.chess.game.GameDTO;
import com.games.chess.game.Location;
import com.games.chess.game.PieceType;
import com.games.chess.peices.Bishop;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    public GameDTO startGame(){
        GameDTO gameDTO = new GameDTO();
        return gameDTO;
    }

    public GameDTO nextMove(GameDTO gameDTO){
        if (PieceType.BISHOP.value.equals(gameDTO.getPieceType())){
            Bishop bishop = new Bishop(gameDTO.getPlayer(), gameDTO.getStartLocation());
            boolean isValidMove = bishop.isValid(gameDTO.getFinishLocation());
            gameDTO.getResult().setValidMove(isValidMove);
            boolean isCheckMate = checkCheckMate(gameDTO);
            gameDTO.getResult().setCheckMate(isCheckMate);
        }
        return gameDTO;
    }

    private boolean checkCheckMate(GameDTO gameDTO) {
        return false;
    }

}
