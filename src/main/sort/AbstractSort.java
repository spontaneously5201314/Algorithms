package main.sort;

import java.util.Arrays;

public abstract class AbstractSort implements ISort {

    void doSort(int[] sourceArray) {
        System.out.println("排序前的数组是： " + Arrays.toString(sourceArray));
        System.out.println("使用的排序方法是： " + getSortName());
        System.out.println("排序后的数组是： " + Arrays.toString(sortArray(sourceArray)));
    }

    /**
     * 返回排序方法的名字
     *
     * @return 排序方法的名字
     */
    protected abstract String getSortName();

    /**
     * 交换int数组中的两个下标中的数据
     * @param arr 数组
     * @param i 交换的第一个下标
     * @param j 交换的第二个下标
     */
    protected void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
