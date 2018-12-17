package main.nowcoder.string;

/**
 * 句子的逆序
 * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，
 * 字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
 * 给定一个原字符串A和他的长度，请返回逆序后的字符串。
 * <p>
 * 测试样例：
 * "dog loves pig",13
 * 返回："pig loves dog"
 */
public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverseSentence("dog loves pig", 13));
    }

    public static String reverseSentence(String A, int n) {
        String reverseString = reverseSentenceAnyWhere(A, 0, A.length() - 1);
        String[] reverses = reverseString.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < reverses.length; i++) {
            sb.append(reverseSentenceAnyWhere(reverses[i], 0, reverses[i].length() - 1));
            if (i != reverses.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * 逆序一个字符串的任意子串
     *
     * @param str   给定任意一个字符串
     * @param start 需要逆序的开始位置
     * @param end   需要逆序的结束位置
     * @return 逆序后的结果
     */
    public static String reverseSentenceAnyWhere(String str, int start, int end) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] strChars = str.toCharArray();
        for (int i = start; i <= (end - start) / 2; i++) {
            char temp = strChars[i];
            strChars[i] = strChars[strChars.length - i - 1];
            strChars[strChars.length - i - 1] = temp;
        }
        return String.valueOf(strChars);
    }

}
