package main

import "fmt"

//Example 1:
//
//Input: arr[1,1,2,2,2,3,3]
//
//Output: arr[1,2,3,_,_,_,_]
//
//Explanation: Total number of unique elements are 3, i.e[1,2,3]
//and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

func main() {

	arr := []int{1, 1, 2, 2, 2, 3, 3}

	n := len(arr)

	k := removeDuplicate(arr, n)

	fmt.Println("The array after removing the duplicate is ")
	for i := 0; i < k; i++ {
		fmt.Print(arr[i], " ")
	}
}

func removeDuplicate(arr []int, n int) int {
	i := 0
	for j := 1; j <= n-1; j++ {
		if arr[i] != arr[j] {
			i++
		}
		arr[i] = arr[j]
	}
	return i + 1
}
