import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.*;

public class shembullWeb {
    public static void main(String[] args) throws FileNotFoundException {
        String addres = "https://lucianobicaku.github.io/webdevplan/";
        URL pageLocation = new URL(addres);
        Scanner in = new Scanner(pageLocation.openStream());
        in.close();
    }
}