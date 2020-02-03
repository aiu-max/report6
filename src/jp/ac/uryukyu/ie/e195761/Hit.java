package jp.ac.uryukyu.ie.e195761;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Hit  {
    public void hit(Character character){
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("数値を入力してください。");
        String num = scanner.next();
        String array[] = new String[num.length()];
        for (i = 0; i < array.length; i++) {
            array[i] = num.substring(i, i + 1);
        }

        System.out.println(character.player + "が入力した数値は " + num + " です。");

        String array2[] = new String[character.number.length()];
        for (i = 0; i < character.number.length(); i++) {
            array2[i] = character.number.substring(i, i + 1);
        }

        int ito, bi;
        ito = 0;
        bi = 0;
        for (i = 0; i < num.length(); i++) {

            for (int e = 0; e < character.number.length(); e++) {
                if (array[i].equals(array2[e]) && i == e) {
                    System.out.println("1イート");
                    ito += 1;
                } else if (array[i].equals(array2[e])) {
                    System.out.println("1バイト");
                    bi += 1;
                }

            }
        }
        String a = Integer.toString(ito);
        String b = Integer.toString(bi);
        System.out.println("結果は" + a + "イート" + b + "バイト");
        }




        }
