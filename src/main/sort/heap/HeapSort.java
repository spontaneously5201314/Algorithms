package main.sort.heap;

import main.sort.AbstractSort;

/**
 * 堆排序（Heapsort）是指利用堆这种数据结构所设计的一种排序算法。堆积是一个近似完全二叉树的结构，
 * 并同时满足堆积的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。
 * 堆排序可以说是一种利用堆的概念来排序的选择排序。分为两种方法：
 * 大顶堆：每个节点的值都大于或等于其子节点的值，在堆排序算法中用于升序排列；
 * 小顶堆：每个节点的值都小于或等于其子节点的值，在堆排序算法中用于降序排列；
 * 堆排序的平均时间复杂度为 Ο(nlogn)。
 * <p>
 * 算法步骤
 * 创建一个堆 H[0……n-1]；
 * 把堆首（最大值）和堆尾互换；
 * 把堆的尺寸缩小 1，并调用 shift_down(0)，目的是把新的数组顶端数据调整到相应位置；
 * 重复步骤 2，直到堆的尺寸为 1。
 */
public class HeapSort extends AbstractSort {
    @Override
    protected String getSortName() {
        return "堆排序";
    }

    @Override
    public int[] sortArray(int[] sourceArray) {
        int len = sourceArray.length;
        buildMaxHeap(sourceArray, sourceArray.length);

        for (int i = len - 1; i > 0; i--) {
            swap(sourceArray, 0, i);
            len--;
            heapify(sourceArray, 0, len);
        }
        return sourceArray;
    }

    private void buildMaxHeap(int[] arr, int len) {
        for (int i = (int) Math.floor(len / 2); i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    private void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }
}
