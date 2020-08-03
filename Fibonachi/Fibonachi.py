def fibonaci(n):
    a = 0
    b = 1
    for __ in range(n):
        a, b = b, a + b
    return a


print(fibonaci(0))
print(fibonaci(1))
print(fibonaci(2))
