package main

import (
	"fmt"
)

var got = []int{8, 4, 7, 6, 7, 3, 2, 1, 9}
var want = []int{1, 2, 3, 4, 6, 7, 7, 8, 9}

func sort(s []int) {
	for i := 0; i < len(s); i++ {
		for j := 0; j < len(s); j++ {
			if s[i] < s[j] {
				si := s[i]
				s[i] = s[j]
				s[j] = si
			}
		}
	}

}

func main() {
	sort(got)
	fmt.Println("got", got)
	fmt.Println("want", want)
	fmt.Println("Hello, playground")
}
