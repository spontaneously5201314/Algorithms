package main.nowcoder.string;

import javax.print.DocFlavor;
import java.util.*;

/**
 * 拼接最小字典序
 * 对于一个给定的字符串数组，请找到一种拼接顺序，使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。
 * 给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。
 * <p>
 * 测试样例：
 * ["abc","de"],2
 * "abcde"
 * <p>
 * 思路：
 * 比如说A和B两个字符串，不应该比较两个字符串谁更小，而应该比较A+B和B+A哪个更小
 */
public class Prior {

    public static void main(String[] args) {
        System.out.println(findSmallest(new String[]{
                "kid", "yqt", "i", "k"
        }, 4));
    }

    public static String findSmallest(String[] strs, int n) {
        if (strs.length == 0) {
            return null;
        }
        if (strs.length == 1) {
            return strs[1];
        }
        List<String> list = new ArrayList<>(Arrays.asList(strs));
        list.sort((o1, o2) -> {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s1.compareTo(s2);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
