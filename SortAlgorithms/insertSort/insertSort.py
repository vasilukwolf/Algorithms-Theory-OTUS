def insertionSort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i-1
        while j >=0 and key < arr[j] :
                arr[j+1] = arr[j]
                j -= 1
        arr[j+1] = key


arr = [7,5,7,3,4,5,6,7,8,1]
insertionSort(arr)
print (arr)
