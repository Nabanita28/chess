package com.games.chess.service;

import com.games.chess.game.*;
import com.games.chess.peices.*;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    public GameDTO startGame(){
        GameDTO gameDTO = new GameDTO();
        gameDTO.setBoard(createNewBoard(gameDTO.getBoard()));
        return gameDTO;
    }

    public GameDTO nextMove(GameDTO gameDTO){
        if (PieceType.BISHOP.value.equals(gameDTO.getPieceType())){
            Bishop bishop = new Bishop(gameDTO.getPlayer(), gameDTO.getStartLocation(), gameDTO.getColour());
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

    public Piece[][] createNewBoard(Piece[][] board){

        board[0][0] = new Rook(Player.PLAYER2, new Location(0, 0), Colour.BLACK);
        board[0][1] = new Knight(Player.PLAYER2, new Location(0, 1), Colour.BLACK);
        board[0][2] = new Bishop(Player.PLAYER2, new Location(0, 2), Colour.BLACK);
        board[0][3] = new Queen(Player.PLAYER2, new Location(0, 3), Colour.BLACK);
        board[0][4] = new King(Player.PLAYER2, new Location(0, 4), Colour.BLACK);
        board[0][5] = new Bishop(Player.PLAYER2, new Location(0, 5), Colour.BLACK);
        board[0][6] = new Knight(Player.PLAYER2, new Location(0, 6), Colour.BLACK);
        board[0][7] = new Rook(Player.PLAYER2, new Location(0, 7), Colour.BLACK);

        for(int i=1; i<2; i++){
            for(int j=0; j<8; j++){
                board[i][j] = new Pawn(Player.PLAYER2, new Location(i, j), Colour.BLACK);
            }
        }

        board[7][0] = new Rook(Player.PLAYER1, new Location(7, 0), Colour.WHITE);
        board[7][1] = new Knight(Player.PLAYER1, new Location(7, 1), Colour.WHITE);
        board[7][2] = new Bishop(Player.PLAYER1, new Location(7, 2), Colour.WHITE);
        board[7][3] = new Queen(Player.PLAYER1, new Location(7, 3), Colour.WHITE);
        board[7][4] = new King(Player.PLAYER1, new Location(7, 4), Colour.WHITE);
        board[7][5] = new Bishop(Player.PLAYER1, new Location(7, 5), Colour.WHITE);
        board[7][6] = new Knight(Player.PLAYER1, new Location(7, 6), Colour.WHITE);
        board[7][7] = new Rook(Player.PLAYER1, new Location(7, 7), Colour.WHITE);

        for(int i=6; i<7; i++){
            for(int j=0; j<8; j++){
                board[i][j] = new Pawn(Player.PLAYER1, new Location(i, j), Colour.WHITE);
            }
        }
        return board;
    }

}
