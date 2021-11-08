import sys

n, m, b = map(int, sys.stdin.readline().split())

Map = []
for _ in range(n):
    A = map(int, sys.stdin.readline().split())
    Map.extend(A)

height = 0
min_time = int(1e9)

for h in range(min(Map), max(Map)+1):
    inv = b
    time = 0
    
    plus = 0
    minus = 0
    for i in Map:
        sub = i - h

        if sub > 0:
            plus += sub
        else:
            minus += sub
    
    inv = b + plus + minus
    time = plus *2 - minus

    if inv >= 0 and min_time >= time:
        min_time = time
        height = h

print(min_time, height)


'''
3 4 1
64 62 64 64
64 64 64 64
64 64 64 63
'''