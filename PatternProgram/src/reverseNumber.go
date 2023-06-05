//Problem Statement: Given a number N reverse the number and print it.
//
//Examples:
//
//Example 1:
//Input: N = 123
//Output: 321
//Explanation: The reverse of 123 is 321

package main

import "fmt"

func main() {
	n := 12345

	num := n

	rev := 0

	for n != 0 {
		rem := n % 10
		rev = rev*10 + rem
		n = n / 10
	}
	fmt.Println("The reverse of a number ", num, " is ", rev)

}
