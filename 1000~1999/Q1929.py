n, m = map(int, input().split())
num_list = list(range(n, m+1))

for i in range(2, int(m**(1/2))+2):
    isPrime = 0
    for j in range(2, i):
        if i % j == 0:
            isPrime = -1
            break

    if isPrime == 0:
        k = i
        l = 2
        while k <= m:
            k = i*l
            try:
                num_list.remove(k)
            except:
                print(end='')
            l += 1
    print(num_list)

print(num_list)
