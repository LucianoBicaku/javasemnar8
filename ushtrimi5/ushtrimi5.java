import java.io.*;
import java.util.Scanner;

class ushtrimi5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String Term_input = in.nextLine();
        String[] words = Term_input.split(" ");

        in.close();
        for (String var : words) {
            File file = new File(var);
            if (file.exists()) {
                Scanner input = new Scanner(file);
                System.out.println(input.nextLine());
                input.close();
            }
        }
    }
}
