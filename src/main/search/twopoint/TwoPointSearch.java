package main.search.twopoint;

/**
 * 实现一个二分查找
 */
public class TwoPointSearch {

    private static final int NOT_FOUND = -1;

    public static void main(String[] args) {
        int[] src = {1, 3, 4, 5, 8, 15, 21, 27, 33};
        System.out.println(getIndexByTwoPoint(src, 15));
        System.out.println(getIndexByTwoPoint(src, 27));
    }

    /**
     * 二分查找
     *
     * @param src    源数组
     * @param number 要查找的数字
     * @return 返回要查找的数字在源数组中的下标，没找到返回-1
     */
    private static int getIndexByTwoPoint(int[] src, int number) {
        if (src.length == 0) {
            return NOT_FOUND;
        }
        int start = 0;
        int end = src.length - 1;
        while (true) {
            int middle = (start + end) / 2;
            if (src[middle] == number) {
                return middle;
            } else if (src[middle] < number) {
                start = middle + 1;
            } else if (src[middle] > number) {
                end = middle - 1;
            }
        }
    }
}
