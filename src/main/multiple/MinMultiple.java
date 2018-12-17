package main.multiple;

import main.divisor.MaxDivisor;

/**
 * 求最小公倍数
 * 最小公倍数等于两个数字的积除以最大公约数
 */
public class MinMultiple {

    public static void main(String[] args) {
        System.out.println((222 * 407) / MaxDivisor.euclid(222, 407));
    }

}
