package game;

import exceptions.OutOfBoardCharacterException;
import java.util.*;
public class Board {

    private int boardLength = 64;
    private Cell[] board = new Cell[boardLength];
    List<Cell> listOfElements;


    /**
     * this method will get the board
     * @return returns the board variable
     */
    public Cell[] getBoard() {
        return board;
    }

    /**
     * Creates the board and fills it
     */
    public Board() {
        listOfElements = new ArrayList<Cell>();
        int counter = 0;
        while (counter < boardLength) {
            Cell square = new Cell();
            board[counter] = square;
            counter++;
            listOfElements.add(square);
        }
//        for (Cell element : listOfElements
//        ) {
//            System.out.println(element);
//        }
//        System.out.println(listOfElements.get(42));
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
     * Gets the surprise of the cell
     * @param cellNumber the number of the cell
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
