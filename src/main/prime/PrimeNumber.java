package main.prime;

/**
 * 找到1~100之间的质数，就是只能被1和它本身才能整除的数字
 */
public class PrimeNumber {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * 判断一个数字是不是素数
     *
     * @param number 需要进行判断的数字
     * @return true表示是素数，false表示不是
     */
    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
