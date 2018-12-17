package main.divisor;

/**
 * 求两个数字的最大公约数，假设两个数a和b，能够被a和b同时整除的数中最大的一个数，就叫做最大公约数
 */
public class MaxDivisor {

    public static void main(String[] args) {
        System.out.println(getMaxDivisor(88, 48));
        System.out.println(euclid(88, 48));
        System.out.println(euclid(222,407));
        System.out.println(euclid(39, 24));
    }

    /**
     * 方法二：欧几里得算法（辗转相除法）
     * 始终用较大数除以较小数，然后用余数代替较大数，整除时的除数就是最大公约数
     * 比如求222和407的最大公约数
     * 222      407     （407/222 余数 185）
     * 222      185     （222/185 余数 37）
     * 185      37      （185/37  余数 0）
     *
     * @param one 第一个数字
     * @param two 第二个数字
     * @return 返回最大公约数
     */
    public static int euclid(int one, int two) {
        return getDiv(Math.min(one, two), Math.max(one, two));
    }

    private static int getDiv(int min, int max) {
        int dev = max % min;
        if (dev == 0) {
            return min;
        }
        return getDiv(Math.min(dev, min), min);
    }

    /**
     * 方法一：常规方法
     * 求两个数字的最大公约数
     *
     * @param one 第一个数字
     * @param two 第二个数字
     * @return 返回最大公约数
     */
    private static int getMaxDivisor(int one, int two) {
        int min = Math.min(one, two);
        int maxDiv = 0;
        for (int i = min; i >= 1; i--) {
            if (one % i == 0 && two % i == 0) {
                maxDiv = i;
                break;
            }
        }
        return maxDiv;
    }

}
