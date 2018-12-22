public class Queen extends Chessman {
    private boolean color;
    //private char sign = 'Q';

    Queen(boolean color, byte position) {
        super(color, position, 'q');
        this.color = color;
        //some comments
    }

    void testForGit() {}////////


    @Override
    boolean setPosition(int pos) {
        return false;
    }
}
