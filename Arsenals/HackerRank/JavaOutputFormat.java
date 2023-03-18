package Arsenals.HackerRank;

import java.io.*;
import java.util.*;

public class JavaOutputFormat {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String s1 = sc.next();
            int n1 = sc.nextInt();
            System.out.printf("%-14s %03d %n", s1, n1);
        }
        System.out.println("================================");
        
    }
}