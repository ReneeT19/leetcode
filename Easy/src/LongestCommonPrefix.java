public class LongestCommonPrefix {
/*   Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
    public static void main(String[] args) {
        GetLongestCommonPrefix getLongestCommonPrefix = new GetLongestCommonPrefix ();
        String[] strs =  new String[] { "flower", "flow", "flight"};
        String[] strs2 =  new String[] {"dog","racecar","car"};
        String[] strs3 =  new String[] { "chin", "china", "chinese", "chinaberry"};
        System.out.println(getLongestCommonPrefix.returnLongestCommonPrefix(strs));
        System.out.println(getLongestCommonPrefix.returnLongestCommonPrefix(strs2));
        System.out.println(getLongestCommonPrefix.returnLongestCommonPrefix(strs3));
    }

    static class GetLongestCommonPrefix {
        public static String returnLongestCommonPrefix(String[] strs) {
            int size = strs.length;
            String commonPrefix = "";
            int i = 0;
            while(i < size - 1) {
//                if(strs[i].length() < strs[i+1].length()) {
//                    int length = strs[i].length();
//                }
                if(strs[i].charAt(i) == strs[i+1].charAt(i)) {
                    commonPrefix += Character.toString(strs[i].charAt(i));
                    i++;
                } else {
                    return "";
                }
            }
            return commonPrefix;
        }
    }
}
