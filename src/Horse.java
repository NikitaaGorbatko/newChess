public class Horse extends Chessman{
    private boolean color;
    //private char sign = 'E';

    Horse(boolean color, byte position) {
        super(color, position, 'H');
        this.color = color;
    }

    @Override
    boolean setPosition(int pos) {
        if(color) {

        } else {

        }
        return false;
    }

}
