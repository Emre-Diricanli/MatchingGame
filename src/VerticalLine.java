public class VerticalLine extends Line{

    public VerticalLine(int start_x, int start_y, int length) {
        super(start_x, start_y, length);
        theCharacter = '|';
    }

    public boolean onLine(int x, int y) {
        if((y != start_y) && (x<start_x) && (x > start_x+length)){
            return false;
        }else{
            return true;
        }
    }
}
