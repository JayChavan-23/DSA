def fib(n):
    firstNum = 0
    secondNum = 1

    while(n!=0):
        
        
        nextNum = firstNum + secondNum
        print(firstNum)
        n = n-1
        firstNum = secondNum
        secondNum = nextNum
    



b = 10

fib(b)