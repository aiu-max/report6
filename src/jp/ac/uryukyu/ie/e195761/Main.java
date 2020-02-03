package jp.ac.uryukyu.ie.e195761;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random rand = new Random();
        int n  = rand.nextInt(900) + 100;
        String a = Integer.toString(n);
        Character character1 = new Character("太郎", a);

        Hit ac = new Hit();
        ac.hit(character1);

    }
}
