def EvklidFunction(a,b):
    while a!=0 and b!=0:
        if a > b:
            a = a % b
        else:
            b = b % a

    return a


print(EvklidFunction(1234567890,12))
