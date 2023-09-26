import java.util.ArrayList;
import java.util.Random;

public class FakeCharacter {
    private char [][] characters;
    private int size;
    ArrayList<Line> lines = new ArrayList<Line>();
    private Random r = new Random();

    public void makePaths(int paths){

            for(int i = 0; i < paths; i++){
                int randx = r.nextInt();
                int randy = r.nextInt();
                int randlength = r.nextInt();
                int randSelection = r.nextInt(0,1);
                if(randSelection == 0){
                    lines.add(new HorizontalLine(randx, randy, randlength));
                }else if (randSelection == 1){
                    lines.add(new VerticalLine(randx, randy, randlength));
                }
            }
    }

    public void addCircles(int num){
        int randRow = r.nextInt(1, size);
        int randCol = r.nextInt(1, size);
        characters [randRow][randCol] = 'o';
    }

    public FakeCharacter(int size , int paths) {
        this.size = size;
        characters = new char[size][size];
        makePaths(paths);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int l = 0; l < lines.size(); l++) {
                    if (lines.get(l).onLine(i, j)) {
                        characters[i][j] = lines.get(l).theCharacter;
                    }
                }
            }
            addCircles(4);
        }
    }

        public void printCharacter(){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (characters[i][j] == '\u0000') {
                        System.out.print(" ");
                    } else {
                        System.out.print(characters[i][j]);
                    }
                }
            }
        }

    public static void main (String[]args){
        for (int i = 0; i < 5; i++) {
            FakeCharacter myChar = new FakeCharacter(5, 10);
            myChar.printCharacter();
            System.out.println("~~~~~~~~~~");
        }
    }
}

