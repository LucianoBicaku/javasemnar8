import java.io.*;
import java.util.*;

public class ushtrimi7 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("./input.txt");
        File file = new File("./output.txt");
        PrintWriter out = new PrintWriter(file);
        Scanner in = new Scanner(inputFile);
        ArrayList<String> lines = new ArrayList<String>();
        while (in.hasNextLine()) {
            lines.add(in.nextLine());
        }
        Collections.reverse(lines);
        for (String x : lines) {
            out.println(x);
        }
        in.close();
        out.close();
    }
}