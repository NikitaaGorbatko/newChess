public class Elephant extends Chessman{
    private boolean color;
    //private char sign = 'E';

    Elephant(boolean color, byte position) {
        super(color, position, 'e');
        this.color = color;
    }


    @Override
    boolean setPosition(int pos) {
        return true;
    }

}
