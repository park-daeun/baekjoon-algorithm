import sys

n, m = map(int, sys.stdin.readline().split())
money = [int(sys.stdin.readline()) for _ in range(n)]
money = list(set(money))
money.sort()

d = [0] * (m+1)

for c in money:
    if c > m:
        break
    d[c] = 1

for i in range(1, m+1):
    for j in money:
        if i > j and (d[i] == 0 or d[i] > d[i-j] + 1):
            if d[i-j] == 0:
                continue
            d[i] = d[i-j] + 1

if d[m] == 0:
    print(-1)
else:
    print(d[m])

'''
입력 예시
2 15
2
3

3 4
3
5
7

출력 예시
5

-1
'''