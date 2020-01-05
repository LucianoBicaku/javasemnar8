import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class shembull {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("./input.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("./output.txt");

        double total = 0;

        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            out.print(value + " ");
            total += value;
        }
        out.print(total);
        out.close();
        in.close();
    }
}