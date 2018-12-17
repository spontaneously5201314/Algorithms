package main.nowcoder.string;

/**
 * 词语变形
 * 对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，
 * 请设计一个高效算法，检查两给定串是否互为变形词。
 * 给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。
 * <p>
 * 测试样例：
 * "abc",3,"bca",3
 * 返回：true
 */
public class Transform {

    public static boolean chkTransform(String A, int lena, String B, int lenb) {
        if (A == null || B == null || lena != lenb) {
            return false;
        }
        int[] map = new int[256];

        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();

        for (int i = 0; i < charsA.length; i++) {
            map[charsA[i]]++;
        }
        for (int i = 0; i < charsB.length; i++) {
            if (map[charsB[i]]-- == 0) {
                return false;
            }
        }
        return true;
    }
}
