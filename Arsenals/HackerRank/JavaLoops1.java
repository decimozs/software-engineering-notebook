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

public class JavaLoops1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int N = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + N * i);
        }

        bufferedReader.close();
    }
}
