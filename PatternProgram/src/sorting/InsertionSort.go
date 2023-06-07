package main

import "fmt"

//Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.
//
//Examples:
//
//Example 1:
//Input: N = 6, array[] = {13,46,24,52,20,9}
//Output: 9,13,20,24,46,52
//Explanation:
//After sorting the array is: 9,13,20,24,46,52

func main() {

	arr := []int{13, 46, 24, 52, 20, 9}

	n := len(arr)

	insertionSort(arr, n)
}

func insertionSort(arr []int, n int) {

	for i := 0; i <= n-1; i++ {
		j := i
		for j > 0 && arr[j-1] > arr[j] {
			temp := arr[j-1]
			arr[j-1] = arr[j]
			arr[j] = temp
			j--
		}
	}

	fmt.Println("After Insertion Sort")
	for i := 0; i <= n-1; i++ {
		fmt.Print(arr[i], " ")
	}

}
