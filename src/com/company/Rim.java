package com.company;

public class Rim {
    void rimsky(int sum) {
        int number = sum;
        String romanCifr = "";
        if (number < 0 || number > 100) {
            System.out.println("");
        }
        else if (sum == 0)  {System.out.println(""); }
        else
        {
            System.out.println("Ответ: " + romanCifr);
            System.out.println(convert(number));
        }

    }



    public static String romanCifr(int n, String one, String five, String ten){

        if(n >= 1)
        {
            if(n == 1)
            {
                return one;
            }
            else if (n == 2)
            {
                return one + one;
            }
            else if (n == 3)
            {
                return one + one + one;
            }
            else if (n==4)
            {
                return one + five;
            }
            else if (n == 5)
            {
                return five;
            }
            else if (n == 6)
            {
                return five + one;
            }
            else if (n == 7)
            {
                return five + one + one;
            }
            else if (n == 8)
            {
                return five + one + one + one;
            }
            else if (n == 9)
            {
                return one + ten;
            }

        }
        return "";
    }

    public static String convert(int number) {
        if (number < 0 || number > 100) {
            return "This number cannot be converted";
        }

        String ones = romanCifr(number % 10, "I", "V", "X");
        number /= 10;

        String tens = romanCifr(number % 10, "X", "L", "C");
        number /= 10;

        String hundreds = romanCifr(number % 10, "C", "D", "M");
        number /= 10;

        String result = hundreds + tens + ones;
        return result;

    }



}
