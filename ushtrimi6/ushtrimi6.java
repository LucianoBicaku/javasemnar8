import java.io.*;
import java.util.Scanner;

public class ushtrimi6 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./HelloPrinter.java");
        Scanner in = new Scanner(file);
        String output = "";
        while (in.hasNextLine()) {
            StringBuilder sb = new StringBuilder(in.nextLine());
            output = sb.reverse().toString();
            System.out.println(output);
        }
        in.close();
    }
}