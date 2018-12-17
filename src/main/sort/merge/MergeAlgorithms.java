package main.sort.merge;

import java.util.Arrays;

/**
 * 主要是解决面试中遇到的二路归并的算法问题
 */
public class MergeAlgorithms {

    public static void main(String[] args) {
        //主要是为了解决今天下午58同城面试出的这个归并排序算法问题
        int[] one = {1, 0, 7, 6, 2, 5, 7, 9};
        int[] two = {5, 8, 1, 3, 4, 9, 10, 50};
//        System.out.println(Arrays.toString(sortByMerge(one, two)));

        int[] sortedOne = {0, 1, 2, 5, 6, 7, 7, 9};
        int[] sortedTwo = {1, 3, 4, 5, 8, 9, 10, 50};
        System.out.println(Arrays.toString(sortByMerge(sortedOne, sortedTwo)));
    }

    /**
     * 二路归并排序算法
     *
     * @param one 第一个数组
     * @param two 第二个数组
     * @return 排序后的数组
     */
    private static int[] sortByMerge(int[] one, int[] two) {
        int resultIndex = 0;
        int[] result = new int[one.length + two.length];
        int i = 0, j = 0;
        for (; i < one.length && j < two.length; ) {
            if (one[i] < two[j]) {
                result[resultIndex++] = one[i++];
            } else if (one[i] > two[j]) {
                result[resultIndex++] = two[j++];
            } else {
                result[resultIndex++] = one[i++];
                result[resultIndex++] = two[j++];
            }

        }
        if (i == one.length) {
            for (; j < two.length; j++) {
                result[resultIndex++] = two[j];
            }
        } else if (j == two.length) {
            for (; i < one.length; i++) {
                result[resultIndex++] = one[i];
            }
        }
        return result;
    }
}
