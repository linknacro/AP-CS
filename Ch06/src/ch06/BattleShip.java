/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06;

/**
 *
 * @author 19502
 */
public class BattleShip
{

    public static void main(String[] args)
    {
        char[][] board = new char[10][10];
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = 'O';
            }
        }

        int num = (int) (Math.random() * 2);

        //Code for patrol boat
        int pXPos = (int) (Math.random() * 9);
        int pYPos = (int) (Math.random() * 9);
        if (num == 0) {
            board[pYPos][pXPos] = 'P';
            board[pYPos][pXPos + 1] = 'P';
        }
        else {
            board[pYPos][pXPos] = 'P';
            board[pYPos + 1][pXPos] = 'P';
        }
        // End of patrol boat

        num = (int) (Math.random() * 2);
        // Code for submarine
        int sXPos = (int) (Math.random() * 8);
        int sYPos = (int) (Math.random() * 8);
        if (num == 0) {
            while (sYPos == pYPos) {
                sYPos = (int) (Math.random() * 10);
            }
            board[sYPos][sXPos] = 'S';
            board[sYPos][sXPos + 1] = 'S';
            board[sYPos][sXPos + 2] = 'S';
        }
        else {
            while (sXPos == pXPos) {
                sXPos = (int) (Math.random() * 8);
            }
            board[sYPos][sXPos] = 'S';
            board[sYPos + 1][sXPos] = 'S';
            board[sYPos + 2][sXPos] = 'S';
        }
        // End of submarine

        num = (int) (Math.random() * 2);
        // Code for battleship
        int bXPos = (int) (Math.random() * 7);
        int bYPos = (int) (Math.random() * 7);
        if (num == 0) {
            while (bYPos == sYPos || bYPos == pYPos) {
                bYPos = (int) (Math.random() * 7);
            }
            board[bYPos][bXPos] = 'B';
            board[bYPos][bXPos + 1] = 'B';
            board[bYPos][bXPos + 2] = 'B';
            board[bYPos][bXPos + 3] = 'B';
        }
        else {
            while (bXPos == sXPos || bXPos == pXPos) {
                bXPos = (int) (Math.random() * 7);
            }
            board[bYPos][bXPos] = 'B';
            board[bYPos + 1][bXPos] = 'B';
            board[bYPos + 2][bXPos] = 'B';
            board[bYPos + 3][bXPos] = 'B';
        }
        // End of battleship

        num = (int) (Math.random() * 2);
        // Code for aircraft carrier
        int cXPos = (int) (Math.random() * 6);
        int cYPos = (int) (Math.random() * 6);
        if (num == 0) {
            while (cYPos == bYPos || cYPos == sYPos || cYPos == pYPos) {
                cYPos = (int) (Math.random() * 6);
            }
            board[cYPos][cXPos] = 'C';
            board[cYPos][cXPos + 1] = 'C';
            board[cYPos][cXPos + 2] = 'C';
            board[cYPos][cXPos + 3] = 'C';
            board[cYPos][cXPos + 4] = 'C';
        }
        else {
            while (cYPos == bYPos || cYPos == sYPos || cYPos == pYPos) {
                cXPos = (int) (Math.random() * 6);
            }
            board[cYPos][cXPos] = 'C';
            board[cYPos + 1][cXPos] = 'C';
            board[cYPos + 2][cXPos] = 'C';
            board[cYPos + 3][cXPos] = 'C';
            board[cYPos + 4][cXPos] = 'C';
        }
        // End of aircraft carrier

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column] + "    ");
            }
            System.out.println("");
        }

    }
}
