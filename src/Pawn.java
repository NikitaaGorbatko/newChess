public class Pawn extends Chessman{
    private boolean color;
    private char sign = 'P';
    private byte position;

    Pawn(boolean color, byte position) {
        super(color, position, 'p');
        this.position = position;
        this.color = color;
    }

    @Override
    boolean setPosition(int pos) {
        if(color) {
            if(pos - getPosition() == 8) {
                position = (byte) pos;
                System.out.println("E");
            }
        } else {

        }
        return false;
    }

    @Override
    public byte getPosition() {
        return super.getPosition();
    }

    @Override
    public char getSign() {
        return super.getSign();
    }
}
