#Finding Armstrong number with function

def armStrong(n):
    s = len(str(n))
    b = n
    sum = 0
    while n != 0 :
        r = n%10
        sum += pow(r,s)
        n = n//10
        
    if (sum == b):
        print("Armstrong")
    else:
        print("Not a Armstrong")


armStrong(153)