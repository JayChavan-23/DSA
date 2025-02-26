num = 5

fact  = 1

#using loop

for i in range(1,num+1):
    fact*=i

print(fact)

#using recursive function

def factorial(n):
    return 1 if(n==1 or n==0) else n * factorial(n-1)

print(factorial(num))
