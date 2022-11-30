package S14最长公共前缀;

//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
//
//
// 示例 1：
//
//
//输入：strs = ["flower","flow","flight"]
//输出："fl"
//
//
// 示例 2：
//
//
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。
//
//
//
// 提示：
//
//
// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] 仅由小写英文字母组成
//
//
// Related Topics 字符串
// 👍 2536 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String key = "";

        if (strs == null) {
            return ans;
        }
        if (strs.length == 1) {
            return strs[0];
        }
        key =strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < key.length()) {
                key = strs[i];
            }
        }
        if (key.equals("")){
            return ans;
        }
        char[] keys = key.toCharArray();
        for (int j = 0; j < keys.length; j++) {
            for (int t = 0; t < strs.length; t++) {
                if (keys[j] != strs[t].charAt(j)) {
                    return ans;
                }
            }
            ans += keys[j];
        }
        return key;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
