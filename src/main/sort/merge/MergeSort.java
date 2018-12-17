package main.sort.merge;

import main.sort.AbstractSort;

import java.util.Arrays;

/**
 * 归并排序（Merge sort）是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
 * 作为一种典型的分而治之思想的算法应用，归并排序的实现由两种方法：
 * 自上而下的递归（所有递归的方法都可以用迭代重写，所以就有了第 2 种方法）；
 * 自下而上的迭代；
 * 在《数据结构与算法 JavaScript 描述》中，作者给出了自下而上的迭代方法。但是对于递归法，作者却认为：
 * <p>
 * 和选择排序一样，归并排序的性能不受输入数据的影响，但表现比选择排序好的多，因为始终都是 O(nlogn) 的时间复杂度。代价是需要额外的内存空间。
 * <p>
 * 算法步骤
 * 申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列；
 * 设定两个指针，最初位置分别为两个已经排序序列的起始位置；
 * 比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置；
 * 重复步骤 3 直到某一指针达到序列尾；
 * 将另一序列剩下的所有元素直接复制到合并序列尾。
 */
public class MergeSort extends AbstractSort {
    @Override
    protected String getSortName() {
        return "归并排序";
    }

    @Override
    public int[] sortArray(int[] sourceArray) {
        //以二路归并来写这个归并排序
        if (sourceArray.length < 2) {
            return sourceArray;
        }

        int middle = sourceArray.length / 2;

        int[] left = Arrays.copyOfRange(sourceArray, 0, middle);
        int[] right = Arrays.copyOfRange(sourceArray, middle, sourceArray.length);

        //递归调用，相当于不断的切分
        return merge(sortArray(left), sortArray(right));
    }

    /**
     * 二路归并排序
     *
     * @param left  左列表
     * @param right 右列表
     * @return 返回排序好的列表
     */
    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }

        }
        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }
}
