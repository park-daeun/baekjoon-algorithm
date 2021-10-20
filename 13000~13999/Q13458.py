import sys
import math

# n: 시험장의 개수
n = int(sys.stdin.readline())

# Ai: 각 시험장에 있는 응시자의 수
A = list(map(int, sys.stdin.readline().split()))

# B: 총감독관이 한 시험장에서 감시할 수 있는 응시자의 수
# C: 부감독관이 한 시험장에서 감시할 수 있는 응시자의 수
b, c = map(int, sys.stdin.readline().split())

max_i = max(A)
total = 0

max_i -= b

for i in A:
    i -= b
    total += 1

    if i > 0:
        total += math.ceil(i/c)

print(total)

'''
입력 예시 / 출력 예시
1
1
1 1
/
1

3
3 4 5
2 2
/
7

5
1000000 1000000 1000000 1000000 1000000
5 7
/
714290

5
10 9 10 9 10
7 20
/
10

5
10 9 10 9 10
7 2
/
13
'''