package com.company;
import java.util.Scanner;

public class Osnova {

    public static void main(String[] args) {
        try {
            Start class1 = new Start();
            Action class2 = new Action();
            Rim class3 = new Rim();
                class1.privet();
            for (;;) {
                Scanner in = new Scanner(System.in);
                System.out.println("Выберете, что вы хотите сделать:\n 1 - посчитать\n 2 - выйти \n 3 - рассказать анектод перед работой для поднятия настроения :)");
                String deystv = in.nextLine();

                if (deystv.equals("1")) System.out.println("Погнали!");
                if (deystv.equals("2")) break;
                if (deystv.equals("3"))
                    System.out.println("Сидит программист глубоко в отладке. \n Подходит сынишка: — Папа, почему солнышко каждый день встает на востоке, а садится на западе? \n — Ты это проверял? \n — Проверял. \n — Хорошо проверял? \n — Хорошо. \n — Работает? \n — Работает. \n — Каждый день работает? \n — Да, каждый день. \n — Тогда ради бога, сынок, ничего не трогай, ничего не меняй.\n А теперь за работу!");
                int sum = class2.analysis();
                class3.rimsky(sum);
            }
                class1.poka();

        } catch (Exception ex) {
            System.out.println("Что-то пошло не так");
        }

    }
}



