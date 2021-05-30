package com.games.chess.controller;

import com.games.chess.game.GameDTO;
import com.games.chess.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping("chess/api/v1")
public class ChessController {

    private final GameService gameService;

    @Autowired
    public ChessController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping(path = "/start", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GameDTO> startGame(){
        GameDTO gameDTO = gameService.startGame();
        return ResponseEntity.ok((gameDTO));
    }

    @PostMapping(path = "/move", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GameDTO> nextMove(@Valid GameDTO gameDTO){
        GameDTO nextMoveGameDTO = gameService.nextMove(gameDTO);
        return ResponseEntity.ok(nextMoveGameDTO);
    }

}
