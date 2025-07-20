package general;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 10, 4, 3, 20, 15};
        int k = 3;
        int min = KSmallest(arr, k);
        System.out.println("Kth Largest element " + min);

        int max = KLargest(arr, k);
        System.out.println("Kth Smallest Element "+ max);
    }

    private static int KLargest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : arr) {
            maxHeap.offer(i);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }

    private static int KSmallest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : arr) {
            minHeap.offer(i);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
