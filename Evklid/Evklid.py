def EvklidFunction(a,b):
    while a!=b:
        if a > b:
            a = a - b
        else:
            b = b - a

    return b


print(EvklidFunction(1234567890,12))
