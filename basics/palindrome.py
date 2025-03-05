def palindromeCheck(x):
    x = str(x)
    if (x == x[::-1]):
        return True
    else:
        return False

n = 121
d=-121

print(palindromeCheck(n))
print(palindromeCheck(d))