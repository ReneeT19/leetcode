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
        String[] strs =  new String[] { "flow", "flight", "flower"};
        String[] strs2 =  new String[] {"dog","racecar","car"};
        String[] strs3 =  new String[] { "china", "chin", "chinese", "chinaberry"};
        System.out.println(getLongestCommonPrefix.returnLongestCommonPrefix(strs));
        System.out.println(getLongestCommonPrefix.returnLongestCommonPrefix(strs2));
        System.out.println(getLongestCommonPrefix.returnLongestCommonPrefix(strs3));
    }

    static class GetLongestCommonPrefix {
        public static String returnLongestCommonPrefix(String[] strs) {
            //declare variables needed in this solution
            int size = strs.length;
            String commonPrefix = "";
            String shortestString = strs[0];
            int shortestStringIndex = 0;

            //check conditions when the array has one, zero, or empty string
            if(strs.length < 1 || strs == null) {
                return "";
            } else if (strs.length == 1) {
                return strs[0];
            }

            //find the shortest string index
            for (int i = 0; i < size; i++) {
                if (strs[i].length() < shortestString.length()) {
                    shortestString = strs[i];
                    shortestStringIndex = i;
                }
            }

            //find the longest common prefix
            commonPrefix = strs[shortestStringIndex]; //store the shortest one in a string using its index
            for(int i = 0; i < size; i++) {
            //Search a string for the first occurrence of shortest string:
                while (strs[i].indexOf(commonPrefix) != 0) {
                    //update commonPrefix to try if this particular string matches the updated substring
                    commonPrefix = commonPrefix.substring(0, commonPrefix.length()-1);
                    //the first round is "flo" and since flight doesn't match flo it goes a second round until it matches "fl"
                    System.out.print("stay in while loop until " + commonPrefix + "\n");
                }
            }
            return commonPrefix;
        }
    }
}
