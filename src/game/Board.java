package game;

import exceptions.OutOfBoardCharacterException;


public class Board {

    private int boardLength = 64;
    private Cell[] board = new Cell[boardLength];




    public Cell[] getBoard() {
        return board;
    }

    /**
     * Creates the board and fills it
     */
    public Board() {
        int counter = 0;
        while (counter < boardLength) {
            Cell square = new Cell();
            board[counter] = square;
            counter++;
        }
    }

    /**
     * Prints the board
     */
    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println("Case n°" + i + " : " + board[i]);
        }
    }

    /**
     * Gets the surprise of the square
     * @param cellNumber the number of the square
     * @throws OutOfBoardCharacterException when the number in parameter is higher than the board length an exception gets thrown
     * @return the surprise corresponding to the cell
     */
    public Surprise goToCell(int cellNumber) throws OutOfBoardCharacterException {
        if (cellNumber >= board.length) {
            throw new OutOfBoardCharacterException();
        } else {
            return board[cellNumber].getSurprise();
        }
    }
}
