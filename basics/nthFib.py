def fib(b):
    firstNum = 0
    secondNum = 1
    while(b!=0):
        nextNum = firstNum+secondNum
        firstNum = secondNum
        secondNum = nextNum
        b = b-1
        if(b == 0):
            print (firstNum)

n = 12

fib(n)