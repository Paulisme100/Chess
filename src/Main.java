import classes.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        HashMap<String, ChessPiece> piecesCollection= new HashMap<>();

        King whiteKing = new King("WKng", 7, 4, Team.WHITE);
        piecesCollection.put(whiteKing.id, whiteKing);
        Queen whiteQueen = new Queen("WQueen", 7, 3, Team.WHITE);
        piecesCollection.put(whiteQueen.id, whiteQueen);
        Bishop whiteBhisop1 = new Bishop("WBishop1", 7, 2, Team.WHITE);
        piecesCollection.put(whiteBhisop1.id, whiteBhisop1);
        Horse whiteHorse1 = new Horse("WHorse1", 7, 1, Team.WHITE);
        piecesCollection.put(whiteHorse1.id, whiteHorse1);
        Rook whiteRook1 = new Rook("WRook1", 7, 0, Team.WHITE);
        piecesCollection.put(whiteRook1.id, whiteRook1);
        Bishop whiteBhisop2 = new Bishop("WBishop2", 7, 5, Team.WHITE);
        piecesCollection.put(whiteBhisop2.id, whiteBhisop2);
        Horse whiteHorse2 = new Horse("WHorse2", 7, 6, Team.WHITE);
        piecesCollection.put(whiteHorse2.id, whiteHorse2);
        Rook whiteRook2 = new Rook("WRook2", 7, 7, Team.WHITE);
        piecesCollection.put(whiteRook2.id, whiteRook2);
        Pawn whitePawn1 = new Pawn("WPawn1", 6, 0, Team.WHITE);
        piecesCollection.put(whitePawn1.id, whitePawn1);
        Pawn whitePawn2 = new Pawn("WPawn2", 6, 1, Team.WHITE);
        piecesCollection.put(whitePawn2.id, whitePawn2);
        Pawn whitePawn3 = new Pawn("WPawn3", 6, 2, Team.WHITE);
        piecesCollection.put(whitePawn3.id, whitePawn3);
        Pawn whitePawn4 = new Pawn("WPawn4", 6, 3, Team.WHITE);
        piecesCollection.put(whitePawn4.id, whitePawn4);
        Pawn whitePawn5 = new Pawn("WPawn5", 6, 4, Team.WHITE);
        piecesCollection.put(whitePawn5.id, whitePawn5);
        Pawn whitePawn6 = new Pawn("WPawn6", 6, 5, Team.WHITE);
        piecesCollection.put(whitePawn6.id, whitePawn6);
        Pawn whitePawn7 = new Pawn("WPawn7", 6, 6, Team.WHITE);
        piecesCollection.put(whitePawn7.id, whitePawn7);
        Pawn whitePawn8 = new Pawn("WPawn8", 6, 7, Team.WHITE);
        piecesCollection.put(whitePawn8.id, whitePawn8);


        King blackKing = new King("BKng", 0, 4, Team.BLACK);
        piecesCollection.put(blackKing.id, blackKing);
        Queen blackQueen = new Queen("BQueen", 0, 3, Team.BLACK);
        piecesCollection.put(blackQueen.id, blackQueen);
        Bishop blackBhisop1 = new Bishop("BlBishop1", 0, 2, Team.BLACK);
        piecesCollection.put(blackBhisop1.id, blackBhisop1);
        Horse blackHorse1 = new Horse("BHorse1", 0, 1, Team.BLACK);
        piecesCollection.put(blackHorse1.id, blackHorse1);
        Rook blackRook1 = new Rook("BRook1", 0, 0, Team.BLACK);
        piecesCollection.put(blackRook1.id, blackRook1);
        Bishop blackBhisop2 = new Bishop("BlBishop2", 0, 5, Team.BLACK);
        piecesCollection.put(blackBhisop2.id, blackBhisop2);
        Horse blackHorse2 = new Horse("BHorse2", 0, 6, Team.BLACK);
        piecesCollection.put(blackHorse2.id, blackHorse2);
        Rook blackRook2 = new Rook("BRook2", 0, 7, Team.BLACK);
        piecesCollection.put(blackRook2.id, blackRook2);
        Pawn blackPawn1 = new Pawn("BPawn1", 1, 0, Team.BLACK);
        piecesCollection.put(blackPawn1.id, blackPawn1);
        Pawn blackPawn2 = new Pawn("BPawn2", 1, 1, Team.BLACK);
        piecesCollection.put(blackPawn2.id, blackPawn2);
        Pawn blackPawn3 = new Pawn("BPawn3", 1, 2, Team.BLACK);
        piecesCollection.put(blackPawn3.id, blackPawn3);
        Pawn blackPawn4 = new Pawn("BPawn4", 1, 3, Team.BLACK);
        piecesCollection.put(blackPawn4.id, blackPawn4);
        Pawn blackPawn5 = new Pawn("BPawn5", 1, 4, Team.BLACK);
        piecesCollection.put(blackPawn5.id, blackPawn5);
        Pawn blackPawn6 = new Pawn("BPawn6", 1, 5, Team.BLACK);
        piecesCollection.put(blackPawn6.id, blackPawn6);
        Pawn blackPawn7 = new Pawn("BPawn7", 1, 6, Team.BLACK);
        piecesCollection.put(blackPawn7.id, blackPawn7);
        Pawn blackPawn8 = new Pawn("BPawn8", 1, 7, Team.BLACK);
        piecesCollection.put(blackPawn8.id, blackPawn8);

    }
}