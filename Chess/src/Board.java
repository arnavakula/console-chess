public class Board {

    private Square[][] board;
    
    public Board(){
        this.board = getInitBoard();
    }

    private Square[][] getInitBoard() {
        board = new Square[8][8];
        
        return board;
    }

    public boolean isValidMoveStraight(String sq1, String sq2){
        
        return false;
    }
}
