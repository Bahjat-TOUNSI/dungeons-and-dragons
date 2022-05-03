public class Board {
    private int boardLength = 64;
    private int position = 0;


    public void movePlayer() {
        int dice1 = (int) (Math.random()*6+1);
        int dice2 = (int) (Math.random()*6+1);
        int sum = dice1 + dice2;
        this.position += sum;
    }

    public void goToTheEnd() {
        while (getPosition() < getBoardLength()) {
            movePlayer();
            System.out.println(this.position);
            if (getPosition() > getBoardLength()) {
                System.out.println("Congrats you won the game!!");
            }
        }
    }

    public int getBoardLength() {
        return boardLength;
    }

    public void setBoardLength(int boardLength) {
        this.boardLength = boardLength;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}