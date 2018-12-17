package main.sort.insert;

import main.sort.AbstractSort;

/**
 * 插入排序是一种最简单直观的排序算法，它的工作原理是通过构建有序序列，
 * 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序和冒泡排序一样，也有一种优化算法，叫做拆半插入。
 * <p>
 * 算法步骤
 * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */
public class InsertSort extends AbstractSort {
    @Override
    protected String getSortName() {
        return "插入排序";
    }

    @Override
    public int[] sortArray(int[] sourceArray) {
        for (int i = 1; i < sourceArray.length; i++) {
            //记录要插入的数据
            int temp = sourceArray[i];

            //从已经排序的序列中最右边的元素开始比较，找到比其小的数
            int j = i;
            while (j > 0 && temp < sourceArray[j - 1]) {
                sourceArray[j] = sourceArray[j - 1];
                j--;
            }

            //存在比其小的数，就插入
            if (j != i) {
                sourceArray[j] = temp;
            }
        }
        return sourceArray;
    }
}
