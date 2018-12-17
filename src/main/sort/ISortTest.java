package main.sort;

import main.sort.bubble.BubbleSort;
import main.sort.bucket.BucketSort;
import main.sort.counting.CountingSort;
import main.sort.heap.HeapSort;
import main.sort.insert.InsertSort;
import main.sort.merge.MergeSort;
import main.sort.quick.QuickSort;
import main.sort.selection.SelectionSort;
import main.sort.shell.ShellSort;

/**
 * 测试这个包下面所有的ISort的实现类的排序结果
 */
public class ISortTest {

    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 2, 1, 3, 7, 0, 89, 54, 65, 32, 75, 48, 8};
        long start = System.nanoTime();
//        AbstractSort sort = new BubbleSort();
//        AbstractSort sort = new SelectionSort();
//        AbstractSort sort = new InsertSort();
//        AbstractSort sort = new ShellSort();
//        AbstractSort sort = new MergeSort();
//        AbstractSort sort = new QuickSort();
//        AbstractSort sort = new HeapSort();
//        AbstractSort sort = new CountingSort();
        AbstractSort sort = new BucketSort();
        sort.doSort(arr);
        System.out.println("排序总共使用时间: " + (System.nanoTime() - start));
    }
}
