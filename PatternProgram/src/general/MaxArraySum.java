package general;

public class MaxArraySum {
    public static void main(String[] args) {
        int[] arr = {4, -1, 2, 1, -5, -1 ,4,};
        System.out.println("Min Array Sum : " + minArraySum(arr));
        System.out.println("Max Array Sum : " + maxArraySum(arr));
    }

    private static int maxArraySum(int[] num) {
        int currSum = num[0];
        int maxSum = num[0];

        for(int i = 1; i< num.length ; i++) {
            currSum = Math.max(num[i], currSum + num[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    private static int minArraySum(int[] num) {
        int currSum = num[0];
        int minSum = num[0];

        for(int i = 1; i< num.length ; i++) {
            currSum = Math.min(num[i], currSum + num[i]);
            minSum = Math.min(minSum, currSum);
        }
        return minSum;
    }
}
