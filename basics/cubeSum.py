#Python Program for cube sum of first n natural numbers
def cubesum(b):
    sum = 0
    while(b!=0):
        sum = sum + pow(b,3)
        b=b-1
    
    print(sum)
n = 5
cubesum(5)