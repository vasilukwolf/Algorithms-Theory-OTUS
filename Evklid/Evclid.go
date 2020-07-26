package main

import "fmt"

func main() {

	var a, b int = 1234567890, 12
	for a != 0 && b != 0 {
		if a > b {
			a = a % b
		} else {
			b = b % a
		}
	}
	fmt.Println(a)
}
