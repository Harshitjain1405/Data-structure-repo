package interview;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Input:

arr[] = [1 3 2 4]

Output:

3 4 4 -1
 Next Greater Element in the array if not print -1
 */
public class InterviewProgram2 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};

        int[] result = findNextGreaterElement(arr);

        int[] arr1= {6,8,0,1,3};
        int[]result1 = findNextGreaterElement(arr1);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
    }

    private static int[] findNextGreaterElement(int[] arr) {
        return IntStream.range(0, arr.length)
                .map(i -> IntStream.range(i+1, arr.length)
                        .filter(j -> arr[j] > arr[i])
                        .map(j -> arr[j])
                        .findFirst().orElse(-1)).toArray();
    }
}
