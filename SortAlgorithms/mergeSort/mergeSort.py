import operator

def merge_sort(A, compare=operator.lt):
    if len(A) < 2:
        return A[:]
    else:
        middle = int(len(A) / 2)
        left = merge_sort(A[:middle], compare)
        right = merge_sort(A[middle:], compare)
        return merge(left, right, compare)



def merge(left, right, compare):
    result = []
    i, j = 0, 0
    while i < len(left) and j < len(right):
        if compare(left[i], right[j]):
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    while i < len(left):
        result.append(left[i])
        i += 1
    while j < len(right):
        result.append(right[j])
        j += 1
    return result



array = [78, 41, 4, 27, 3, 27, 8, 39, 19, 34, 6, 41, 13, 52, 16]
print(merge_sort(array))
