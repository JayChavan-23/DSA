
a = 5
b = 10

# Using Max
print (max(a,b))

#Using Conditional
if(a>b):
    print(a)
else:
    print(b)
#Using lambda
n = lambda a,b: "A" if a>b else "B"

print (n(a,b))

#Using Ternary Operator
res = a if a>b else b 
print(res)