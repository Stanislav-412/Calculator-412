package com.company;

import java.util.Scanner;

public class Action {
    String[] rimic = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public Action() {
    }


    int analysis()  {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите выражение, содержащее в себе лишь 2 числа не больше 10 каждое и знак выражения между ними через пробел: ");
            String stroka = in.nextLine();

            String[] arrSplit = stroka.split(" ");
            for (int i = 0; i < arrSplit.length; i++) {
            }

            int r = 0;
            int a = 0;
            int ch1 = 0;
            int ch2 = 0;
            int sum = 0;


                for (int i = 0; i < arabic.length; i++) {
                    if (arrSplit[0].equals(arabic[i])) a++;
                }
                for (int i = 0; i < rimic.length; i++) {
                    if (arrSplit[0].equals(rimic[i])) r++;
                }
                for (int i = 0; i < arabic.length; i++) {
                    if (arrSplit[2].equals(arabic[i])) a++;
                }
                for (int i = 0; i < rimic.length; i++) {
                    if (arrSplit[2].equals(rimic[i])) r++;
                }

            if (r == 2) {
                for (int i = 0; i < rimic.length; i++) {
                    if (arrSplit[0].equals(rimic[i]))
                        ch1 = i + 1;
                }


                for (int i = 0; i < rimic.length; i++) {
                    if (arrSplit[2].equals(rimic[i]))
                        ch2 = i + 1;
                }

            }

                if (a == 2) {
                    ch1 = Integer.parseInt(arrSplit[0]);
                    ch2 = Integer.parseInt(arrSplit[2]); }
                    if (ch1 < 1 | ch1 > 10 & ch2 < 1 | ch2 > 10) {
                        throw new NullPointerException("Числа должны быть от 1 до 10");}


            char znak;
            if (arrSplit[1].contains("+")) znak = '+';
            else if (arrSplit[1].contains("-")) znak = '-';
            else if (arrSplit[1].contains("/")) znak = '/';
            else if (arrSplit[1].contains("*")) znak = '*';
            else znak = 'n';
            switch (znak) {
                case '+':
                    sum = ch1 + ch2;
                    break;
                case '-':
                    sum = ch1 - ch2;
                    break;
                case '*':
                    sum = ch1 * ch2;
                    break;
                case '/':
                    sum = ch1 / ch2;
                    break;
                case 'n':
                    sum = 0;
                    System.out.println("В выражении нет знака!");
                    break;
            }
            int k = 0;
        if (a == 2) System.out.println("Ответ: " + sum);
          if (r == 2)  return sum;
          else return k;

        }

    }









