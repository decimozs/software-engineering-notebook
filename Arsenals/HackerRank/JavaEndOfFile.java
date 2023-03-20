import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String line;
        int i = 1;
        while(sc.hasNext())
        {
            line = sc.nextLine();
            System.out.println(i + " "+ line);
            i++;
        }
    }
}