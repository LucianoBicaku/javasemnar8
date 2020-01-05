import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ushtrimi1 {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter out = new PrintWriter("./skedar.txt");
        out.print("Hello world");
        out.close();

        File inputFile = new File("./skedar.txt");
        Scanner in = new Scanner(inputFile);
        String Output = in.nextLine();
        System.out.println(Output);
        in.close();
    }
}