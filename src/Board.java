import java.util.ArrayList;

public class Board{

    private ArrayList<Chessman> chess = new ArrayList<>();

    Board() {
        Pawn pawn_1_white = new Pawn(true, (byte) 9);
        Pawn pawn_2_white = new Pawn(true, (byte) 10);
        Pawn pawn_3_white = new Pawn(true, (byte) 11);
        Pawn pawn_4_white = new Pawn(true, (byte) 12);
        Pawn pawn_5_white = new Pawn(true, (byte) 13);
        Pawn pawn_6_white = new Pawn(true, (byte) 14);
        Pawn pawn_7_white = new Pawn(true, (byte) 15);
        Pawn pawn_8_white = new Pawn(true, (byte) 16);
        Rook rook_1_white = new Rook(true, (byte) 1);
        Rook rook_2_white = new Rook(true, (byte) 8);
        Horse horse_1_white = new Horse(true, (byte) 2);
        Horse horse_2_white = new Horse(true, (byte) 7);
        Elephant elephant_1_white = new Elephant(true, (byte) 3);
        Elephant elephant_2_white = new Elephant(true, (byte) 6);
        Queen queen_white = new Queen(true, (byte) 4);
        King king_white = new King(true, (byte) 5);

        Pawn pawn_1_black = new Pawn(false, (byte) 49);
        Pawn pawn_2_black = new Pawn(false, (byte) 50);
        Pawn pawn_3_black = new Pawn(false, (byte) 51);
        Pawn pawn_4_black = new Pawn(false, (byte) 52);
        Pawn pawn_5_black = new Pawn(false, (byte) 53);
        Pawn pawn_6_black = new Pawn(false, (byte) 54);
        Pawn pawn_7_black = new Pawn(false, (byte) 55);
        Pawn pawn_8_black = new Pawn(false, (byte) 56);
        Rook rook_1_black = new Rook(false, (byte) 57);
        Rook rook_2_black = new Rook(false, (byte) 64);
        Horse horse_1_black = new Horse(false, (byte) 58);
        Horse horse_2_black = new Horse(false, (byte) 63);
        Elephant elephant_1_black = new Elephant(false, (byte) 59);
        Elephant elephant_2_black = new Elephant(false, (byte) 62);
        Queen queen_black  = new Queen(false, (byte) 60);
        King king_black  = new King(false, (byte) 61);

        chess.add(pawn_1_white);
        chess.add(pawn_2_white);
        chess.add(pawn_3_white);
        chess.add(pawn_4_white);
        chess.add(pawn_5_white);
        chess.add(pawn_6_white);
        chess.add(pawn_7_white);
        chess.add(pawn_8_white);
        chess.add(rook_1_white);
        chess.add(rook_2_white);
        chess.add(horse_1_white);
        chess.add(horse_2_white);
        chess.add(elephant_1_white);
        chess.add(elephant_2_white);
        chess.add(queen_white);
        chess.add(king_white);

        chess.add(pawn_1_black);
        chess.add(pawn_2_black);
        chess.add(pawn_3_black);
        chess.add(pawn_4_black);
        chess.add(pawn_5_black);
        chess.add(pawn_6_black);
        chess.add(pawn_7_black);
        chess.add(pawn_8_black);
        chess.add(rook_1_black);
        chess.add(rook_2_black);
        chess.add(horse_1_black);
        chess.add(horse_2_black);
        chess.add(elephant_1_black);
        chess.add(elephant_2_black);
        chess.add(queen_black);
        chess.add(king_black);
    }

    public ArrayList<Chessman> getChess() {
        return chess;
    }

    public String move(String alp1, String alp2) throws IllegalTileException {
        int num1 = Integer.parseInt(alp1.substring(1));
        int num2 = Integer.parseInt(alp2.substring(1));
        alp1 = alp1.substring(0,1).toUpperCase();
        alp2 = alp2.substring(0,1).toUpperCase();
        System.out.println("   " + alp1 + "   " + num1 + "   " + alp2 + "   " + num2);

        int pos = check(alp1) + check(num1);
        int whereTo = check(alp2) + check(num2);
        System.out.println("From " + pos + " to " + whereTo);

        for(byte i = 0; i < chess.size(); i++) {
            Chessman localChess = chess.get(i);
            if(pos == localChess.getPosition()) {
                localChess.setPosition((byte) whereTo);
            }
        }
        return "";
    }




    private int check(String alp) throws IllegalTileException {
        int num;
        switch (alp) {
            case "A":
                num = 0;
                break;
            case "B":
                num = 8;
                break;
            case "C":
                num = 16;
                break;
            case "D":
                num = 24;
                break;
            case "E":
                num = 32;
                break;
            case "F":
                num = 40;
                break;
            case "G":
                num = 48;
                break;
            case "H":
                num = 56;
                break;
            default: throw new IllegalTileException();
        }
        return num;
    }

    private int check(int num) throws IllegalTileException {
        if(num > 0 && num <= 8 ) {
            return num;
        } else {
            throw new IllegalTileException();
        }
    }
}
