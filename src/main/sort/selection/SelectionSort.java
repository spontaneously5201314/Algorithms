package main.sort.selection;

import main.sort.AbstractSort;

import java.util.Arrays;

/**
 * 实现一个数组的选择排序
 * 其实现实现是找位置
 * <p>
 * 算法步骤
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 重复第二步，直到所有元素均排序完毕。
 */
public class SelectionSort extends AbstractSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 2, 1, 3, 7};
        System.out.println(Arrays.toString(selection(arr, true)));
        System.out.println(Arrays.toString(selection(arr, false)));
    }

    /**
     * 实现选择排序
     *
     * @param src 原数组
     * @param asc 升序
     * @return 返回排序后的数组
     */
    private static int[] selection(int[] src, boolean asc) {
        for (int i = 0; i < src.length - 1; i++) {
            // 记录下最大值/最小值的数组下标
            int index = 0;
            for (int j = 0; j < src.length - 1 - i; j++) {
                if (asc && src[j] > src[index]) {
                    index = j;
                } else if (!asc && src[j] < src[index]) {
                    index = j;
                }
            }
            //当前范围的最大值/最小值与当前范围的最后一个数字进行交换
            int temp = src[index];
            src[index] = src[src.length - 1 - i];
            src[src.length - 1 - i] = temp;
        }
        return src;
    }

    @Override
    protected String getSortName() {
        return "选择排序";
    }

    @Override
    public int[] sortArray(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            int index = 0;
            for (int j = 0; j < sourceArray.length - 1 - i; j++) {
                if (sourceArray[j] > sourceArray[index]) {
                    index = j;
                }
            }
            int temp = sourceArray[index];
            sourceArray[index] = sourceArray[sourceArray.length - 1 - i];
            sourceArray[sourceArray.length - 1 - i] = temp;
        }
        return sourceArray;
    }
}
