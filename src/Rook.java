public class Rook extends Chessman{
    private boolean color;
    //private char sign = 'R';

    Rook(boolean color, byte position) {
        super(color, position, 'R');
        this.color = color;
    }

    @Override
    boolean setPosition(int pos) {
        return false;
    }
}
