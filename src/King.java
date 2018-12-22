public class King extends Chessman{
    private boolean color;
    //private char sign = 'K';

    King(boolean color, byte position) {
        super(color, position, 'k');
        this.color = color;
    }

    @Override
    boolean setPosition(int pos) {
        return false;
    }
}
