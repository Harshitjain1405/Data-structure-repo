package main

import "fmt"

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: True.
// Explanation: The given array is sorted i.e Every element in the array is smaller than
// or equals to its next values, So the answer is True.
func main() {
	arr := []int{1, 2, 3, 4, 5}
	n := len(arr)

	if checkArraySorted(arr, n) {
		fmt.Println("Array is sorted")
	} else {
		fmt.Println("Array is not sorted")
	}

}

func checkArraySorted(arr []int, n int) bool {
	for i := 1; i <= n-1; i++ {
		if arr[i] < arr[i-1] {
			return false
		}
	}

	return true
}
