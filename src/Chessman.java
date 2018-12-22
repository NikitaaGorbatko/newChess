public abstract class Chessman {
    private byte position;
    private char sign; //figure str is a sign for console.

    Chessman (boolean color, byte position, char sign) {
        this.position = position;
        this.sign = sign;

    }

    abstract boolean setPosition(int pos);

    public byte getPosition() {
        return position;
    }

    public char getSign() {
        return sign;
    }
}
