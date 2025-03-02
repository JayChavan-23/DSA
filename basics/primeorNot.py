n = 7

if n>1:
    for i in range(2,n//2+1):
        if(n%i==0):
            print(n," is not a prime Number")
            break
        else:
            print("It is a prime number")
            break
else:
    print("It is not a prime number")