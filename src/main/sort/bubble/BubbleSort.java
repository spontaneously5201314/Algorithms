package main.sort.bubble;

import main.sort.AbstractSort;
import main.sort.ISort;

import java.util.Arrays;

/**
 * 实现一个数组冒泡算法
 * 冒泡排序核心思想是两两相邻比较交换
 * <p>
 * 算法的步骤：
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * <p>
 * 当输入的数据已经是要求的顺序的是最快
 * 当输入的数据已经是和要求的顺序相反的时候最慢
 */
public class BubbleSort extends AbstractSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 2, 1, 3, 7};
        System.out.println(Arrays.toString(bubble(arr, true)));
        System.out.println(Arrays.toString(bubble(arr, false)));
    }

    /**
     * 数组冒泡排序算法
     * 比较的轮数是数组的长度-1
     *
     * @param src 源数组
     * @param asc 是否是升序，如果传false，则表示是降序
     * @return 返回排序后的数组
     */
    private static int[] bubble(int[] src, boolean asc) {
        // 轮数
        for (int i = 0; i < src.length - 1; i++) {
            // 每轮比较的数组
            for (int j = 0; j < src.length - 1 - i; j++) {
                boolean lt = src[j] > src[j + 1];
                if (lt && asc) {
                    int temp = src[j];
                    src[j] = src[j + 1];
                    src[j + 1] = temp;
                } else if (!lt && !asc) {
                    int temp = src[j + 1];
                    src[j + 1] = src[j];
                    src[j] = temp;
                }
            }
        }
        return src;
    }

    @Override
    public int[] sortArray(int[] sourceArray) {
        for (int i = 1; i < sourceArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < sourceArray.length - i; j++) {
                if (sourceArray[j] > sourceArray[j + 1]) {
                    int temp = sourceArray[j];
                    sourceArray[j] = sourceArray[j + 1];
                    sourceArray[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return sourceArray;
    }

    @Override
    protected String getSortName() {
        return "冒泡排序";
    }
}
