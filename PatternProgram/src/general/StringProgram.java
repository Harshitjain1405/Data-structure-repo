package general;

import java.util.*;

/*
Given a string if 2 or more subsequences of ['a','b','e','t','i','o'] remove them and return the new string
sample input - "testing is a boring job"
sample output is "sng is a ring j"
 */
public class StringProgram {

    public record removeSubsequenceReturn(StringBuilder result, Integer count){}

    public static removeSubsequenceReturn removeSubsequences(String inputList, List<Character> targetList) {
        Map<Character, Integer> removalCount = new HashMap<>();
        int n= inputList.length();
        for (Character c : targetList) {
            removalCount.put(c, removalCount.getOrDefault(c, 0) + 2);
        }

        StringBuilder sb = new StringBuilder();
        int loopCount = 0;
        for (int i=0; i < n - 1 ; i++) {
            loopCount ++;
            if (targetList.contains(inputList.charAt(i)) && targetList.contains(inputList.charAt(i+1))) {
                int count = removalCount.get(inputList.charAt(i));
                if (count > 0) {
                    removalCount.put(inputList.charAt(i), count - 1);// Skip this character
                    i++;
                    continue;
                }
            }
            sb.append(inputList.charAt(i));
        }

        return new removeSubsequenceReturn(sb, loopCount);
    }

    public static void main(String[] args) {
        String input = "testing is a boring job";
        List<Character> targetList = List.of('a', 'b', 'e', 't', 'i', 'o');
        removeSubsequenceReturn resultSet = removeSubsequences(input, targetList);
        System.out.println("Output: " + resultSet.result + " no. of loop: "+ resultSet.count);  // Expected: sng is a ring j
    }
}
