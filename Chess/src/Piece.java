public abstract class Piece {
    private char color;

    // public Piece(){

    // }

    public Piece(char color){
        this.color = color;
    }

    public char getColor(){
        return color;
    }

    public abstract boolean isValidMove(String sq1, String sq2, Board board);
}
