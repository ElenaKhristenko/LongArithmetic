package com.example.longarithmetic;

/**
 * Created by Elena on 13.04.2014.
 */
public class LongArithmetic {

        static public void main(String[] args){
            int[] longInt = new int[100];
            longInt[0] = 1;
            int base = 10;
            int i, j, flag;

            for(i = 0; i < 100; i++) {

                for (j = 0; j < 100; j++)
                    longInt[j] = longInt[j] * 3;

                for (j = 0; j < 100 - 1; j++)
                    if (longInt[j] >= base) {
                        longInt[j + 1] = longInt[j + 1] + longInt[j] / base;
                        longInt[j] = longInt[j] % base;
                    }
            }

            flag = 1;
            for(i = 99; i >= 0; i--) {
                if (flag == 1)
                    if (longInt[i] == 0)
                        continue;
                    else flag = 0;
                System.out.print(longInt[i]);
            }
        }



}
