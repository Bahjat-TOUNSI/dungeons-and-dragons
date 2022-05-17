package game;

import exceptions.OutOfBoardCharacterException;
import java.util.List;
import java.util.ArrayList;

public class Board {

    private int boardLength = 64;
    private List<Cell> board;

    /**
     * Creates the board and fills it
     */
    public Board() {
        board = new ArrayList<>();
        int counter = 0;
        while (counter < boardLength) {
            Cell square = new Cell();
            board.add(square);
            counter++;
        }
/*
         print the element present on the board in the console

        for (Cell element : board
        ) {
            System.out.println(element);
        }
       System.out.println(listOfElements.get(42));
*/
    }

    /**
     * Prints the board
     */
    public void printBoard() {
        for (int i = 0; i < board.size(); i++) {
            System.out.println("Case n°" + i + " : " + board.get(i));
        }
    }

    /**
     * Gets the surprise of the cell
     * @param cellNumber the number of the cell
     * @throws OutOfBoardCharacterException when the number in parameter is higher than the board length an exception gets thrown
     * @return the surprise corresponding to the cell
     */
    public Surprise goToCell(int cellNumber) throws OutOfBoardCharacterException {
        if (cellNumber >= board.size()) {
            throw new OutOfBoardCharacterException();
        } else {
            return board.get(cellNumber).getSurprise();
        }
    }
}
