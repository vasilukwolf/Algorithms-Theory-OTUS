public class BubbleSort {
          public static void bubbleSort(int arr[]) {
              int n = arr.length;
              for (int i = 0; i < n-1; i++){
                for (int j = 0; j < n-i-1; j++){
                  if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                  }
                }
              }
            }
            /* Prints the array */
          public void printArray(int arr[])
          {
              int n = arr.length;
              for (int i=0; i<n; ++i)
                  System.out.print(arr[i] + " ");
              System.out.println();
          }
          public static void main(String[] args) {
            BubbleSort ob = new BubbleSort();
             int[] myArray = {1, 5, 4, 3, 7, 7, 1};
             ob.bubbleSort(myArray);
             ob.printArray(myArray);
          }
        }
