public class Square {
    private char color; //'b' = black, 'e' = empty, 'w' = white
    private Piece piece;

    public Square(Piece piece){
        this.piece = piece;
        this.color = this.piece.getColor();
    }

    public char getColor(){
        return color;
    }

    public Piece getPiece(){
        return piece;
    }

    public void setColor(char color){
        this.color = color;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }
}
