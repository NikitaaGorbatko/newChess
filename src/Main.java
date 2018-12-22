import java.io.Console;
import java.io.IOException;

public class Main{


    public static void main(String args[]) {
        System.out.print("\n------------Welcome to the chess------------\nDo you want to start a game? Y/n\n");
        try {
            int request = System.in.read();
            switch (request) {
                case 121:
                case 89:
                    System.out.println("Fine");
                    Board board = new Board();
                    try {
                        board.move("B1", "C1");//not at all
                    } catch (IllegalTileException ex) {
                        ex.printStackTrace();
                    }
                case 78:
                case 110:
                    System.out.println("Exit");
                    break;
            }
        } catch (IOException ex) {
            System.out.println("Something gone wrong(");
        }
    }


}
