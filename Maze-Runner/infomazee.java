import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Labyrinth {
    private PrintWriter pw;

    private int side1;
    private int side2;

    private int[][] labyrinth;

    Labyrinth(int[][] labyrinth) {
        this.side1 = labyrinth.length;
        this.side2 = labyrinth[0].length;
        this.labyrinth = labyrinth;
    }

    public void printFile(String fileName) throws IOException {
        pw = new PrintWriter(new File(fileName));
        for(int i = 0; i < side1; i++) {
            for (int j = 0; j < side2; j++) {
                pw.print(this.labyrinth[i][j]);
                pw.print(" ");
            }
            pw.println();
        }
        pw.close();
    }
}