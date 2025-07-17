package general;

/*
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:

Insert a character
Delete a character
Replace a character


Example 1:

Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation:
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
Example 2:

Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation:
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
 */
public class EditDistance {

    public static void main(String[] args) {
        String str1 = "horse";
        String str2 = "ros";

        int minCount = minDistance(str1, str2);
        System.out.println(minCount);
    }

    private static int minDistance(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        int[][] dp = new int[n1+1][n2+1];

        for(int i = 0; i<=n1; i++) dp[i][0] = i;
        for(int j = 0; j<= n2; j++) dp[0][j] = j;

        for(int i = 1; i<=n1; i++ ) {
            for(int j = 1; j<= n2; j++) {

                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        return  dp[n1][n2];
    }

}
