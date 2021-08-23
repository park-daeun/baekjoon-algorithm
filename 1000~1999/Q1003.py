import sys

def fib(n, d):
    d[0] = [1, 0]
    d[1] = [0, 1]

    if d[n] != [0, 0]:
        return d[n], d

    for i in range(2, n+1):
        d[i][0] = d[i-1][0] + d[i-2][0]
        d[i][1] = d[i-1][1] + d[i-2][1]
    
    return d[n], d

T = int(sys.stdin.readline())
d = [[0, 0] for _ in range(41)]

for _ in range(T):
    n = int(sys.stdin.readline())
    res, d = fib(n, d)
    print(res[0], res[1])