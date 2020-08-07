package com.dsa.chp03.demos;

import com.dsa.chp03.classes.TicTacToe;

public class TicTacToeDemo {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.putMark(1, 1);     game.putMark(0, 2);
        game.putMark(2, 2);     game.putMark(0, 0);
        game.putMark(0, 1);     game.putMark(2, 1);
        game.putMark(1, 2);     game.putMark(1, 0);
        game.putMark(2, 0);
        System.out.println(game);
        int winningPlayer = game.winner();
        String[] outcome = {"O wins", "Tie", "X wins"};
        System.out.println(outcome[1 + winningPlayer]);
    }

}
