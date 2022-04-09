import java.util.Scanner;;

public class App {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        // System.out.println("What move would you like to make?");
        // String input = scan.nextLine();
        // System.out.println(input);
        // scan.close();

        Rook rook = new Rook('b');
        Square square = new Square(rook);
        System.out.println(rook.getColor());

        Board board = new Board();
        
    }
}


//a1 = board[0]