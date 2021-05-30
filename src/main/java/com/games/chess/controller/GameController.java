package com.games.chess.controller;

import com.games.chess.game.GameDTO;
import com.games.chess.game.Location;
import com.games.chess.game.PieceType;
import com.games.chess.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping("/start")
    public ResponseEntity<GameDTO> startGame(){
        GameDTO gameDTO = gameService.startGame();
        return ResponseEntity.ok((gameDTO));
    }

    @PostMapping("/move")
    public ResponseEntity<GameDTO> nextMove(GameDTO gameDTO){
        GameDTO nextMoveGameDTO = gameService.nextMove(gameDTO);
        return ResponseEntity.ok(nextMoveGameDTO);
    }

}
