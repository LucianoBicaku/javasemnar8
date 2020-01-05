import java.io.*;
import java.util.Scanner;

public class ushtrimi3 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("./input.txt");

        Scanner in = new Scanner(inputFile);
        while (in.hasNextLine()) {
            double shuma = 0;
            for (int i = 0; i < 2; i++) {
                shuma += in.nextDouble();
            }
            System.out.println("mesatarja: " + shuma / 2);
        }
        in.close();
    }
}