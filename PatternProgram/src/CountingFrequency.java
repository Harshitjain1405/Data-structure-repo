//Example 1:
//        Input: arr[] = {10,5,10,15,10,5};
//        Output: 10  3
//        5  2
//        15  1
//        Explanation: 10 occurs 3 times in the array
//        5 occurs 2 times in the array
//        15 occurs 1 time in the array

public class CountingFrequency {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for(int i = 0 ; i< n ; i++){
            if(visited[i])
                continue;
            int count = 1;
            for(int j = i+1; j<n;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count ++;
                }
            }
            System.out.println(arr[i]+ " occurs "+count+" times in the array");
        }
    }
}
