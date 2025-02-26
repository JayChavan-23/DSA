#using function
def simpleIntrest(p,t,r):
    return (p*t*r)/100


Principal = 8
time = 6
rate = 8

print(simpleIntrest(Principal,time,rate))

# Using lambda

# Using lambda

si = lambda p,t,r: (p*t*r)/100

print(si(Principal,time,rate))

