public class HorizontalLine extends Line{

    public HorizontalLine(int start_x, int start_y, int length) {
        super(start_x, start_y, length);
        theCharacter = '-';
    }

    public boolean onLine(int x, int y) {
        if((x != start_x) && (y<start_y) && (y > start_y+length)){
            return false;
        }else{
            return true;
        }
    }
}
