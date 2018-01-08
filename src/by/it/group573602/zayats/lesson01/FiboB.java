package by.it.group573602.zayats.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)
    BigInteger lul[]= new BigInteger[n+1];
        for( int i=0; i<=n; i++){
        if (i==0) lul[0] = BigInteger.valueOf(0);
        else if(i==1) lul[1] = BigInteger.valueOf(1);
        else lul[i]=  lul[i-1].add(lul[i-2]);
    }
        return lul[n];
}

}

