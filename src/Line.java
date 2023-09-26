public abstract class Line {
    protected int start_x, start_y, length;
    protected char theCharacter;

    public Line(int start_x, int start_y, int length) {
        this.start_x = start_x;
        this.start_y = start_y;
        this.length = length;
    }

    public char getTheCharacter() {
        return theCharacter;
    }

    public abstract boolean onLine(int x, int y);
}
