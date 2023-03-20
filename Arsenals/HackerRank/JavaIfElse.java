package Arsenals.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class JavaIfElse {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int N = sc.nextInt();

        if (N %2 == 0) {
            if (N >= 2 && N <=5) {
                System.out.println("Not Weird");
            }
            else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
        
        bufferedReader.close();
    }
}
