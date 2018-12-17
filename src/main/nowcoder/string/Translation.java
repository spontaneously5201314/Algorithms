package main.nowcoder.string;

/**
 * 字符串移位操作
 * 对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后。
 * 给定一个字符串A和它的长度，同时给定len，请返回平移后的字符串。
 * <p>
 * 测试样例：
 * "ABCDE",5,3
 * 返回："DEABC"
 */
public class Translation {

    public static void main(String[] args) {
//        System.out.println(stringTranslation("ABCDE", 5, 3));
    }

    public String stringTranslation(String A, int n, int len) {
        if (A == null || len == 0 || len == n) {
            return A;
        }
        int index = len - 1;
        char[] arrC = A.toCharArray();
        reverseChars(arrC, 0, index);
        reverseChars(arrC, index + 1, n - 1);
        reverseChars(arrC, 0, n - 1);
        return String.valueOf(arrC);
    }

    public void reverseChars(char[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        for (int i = 0; start + i <= mid; i++) {
            swap(arr, start + i, end - i);
        }
    }

    public void swap(char[] arr, int index1, int index2) {
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
