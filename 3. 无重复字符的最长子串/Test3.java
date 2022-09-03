/*
3. 无重复字符的最长子串

        给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

        示例 1:

        输入: s = "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

        示例 2:

        输入: s = "bbbbb"
        输出: 1
        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

        示例 3:

        输入: s = "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
        请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
*/

import java.util.HashMap;

public class Test3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();//map：key记录字符 value 记录字符目前位置(会被后面相同字符覆盖)
        int max = 0, start = 0;//max:已知大长度，start:字符串起始位置
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (map.containsKey(a)) {
                start = Math.max(map.get(a) + 1, start);//最大字符串重新从重复字符的前者后一位开始 ：
                //和start比较是因为abccba像这种回文的由于map里面保存的是前者位置，而start已经指到后面来了会跳到前面
            }
            max = Math.max(max, i - start + 1);
            map.put(a, i);
        }
        return max;


    }

}
