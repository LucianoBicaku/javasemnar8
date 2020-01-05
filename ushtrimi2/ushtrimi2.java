import java.io.*;
import java.util.Scanner;

public class ushtrimi2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        String input = console.next() + ".txt";
        String output = console.next() + ".txt";
        console.close();

        File inputFile = new File(input);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(output);

        int i = 1;
        while (in.hasNextLine()) {
            out.println(i + " " + in.nextLine());
            i++;
        }
        in.close();
        out.close();
    }
}