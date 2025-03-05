import math
n = 16
d = 7
def isPowerOfTwo(n):
        for i in range(31):
            ans = pow(2,i)
            if(ans == n):
                return True
        return False


print(isPowerOfTwo(n))
print(isPowerOfTwo(d))