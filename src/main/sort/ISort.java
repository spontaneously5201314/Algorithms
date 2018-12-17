package main.sort;

/**
 * 抽象一下排序接口
 */
public interface ISort {

    /**
     * 对于int数组进行排序，现在按照升序的方式来进行
     * @param sourceArray 源数组
     * @return 排序好之后的数组
     */
    int[] sortArray(int[] sourceArray);
}
