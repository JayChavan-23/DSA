x, y = 2, 7  # range [x, y]
res = []  # list to store primes

for i in range(x, y + 1):
    if i <= 1:
        continue  # skip non-primes <= 1
    for j in range(2, i // 2 + 1):
        if i % j == 0:
            break  # not a prime
    else:
        res.append(i)  # prime found

print(res if res else "No")
