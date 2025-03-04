#Sum of squares of first n natural numbers

def sumSquare(b):
    sum = 0
    while(b!=0):
        sum = sum + pow(b,2)
        b = b-1
    return sum
    
    

n = 4

print(sumSquare(n))