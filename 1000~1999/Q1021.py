import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())
locations = list(map(int, sys.stdin.readline().split()))
queue = deque(range(1, n+1))

cnt = 0
for i in locations:
    while True:
        if queue[0] == i:
            queue.popleft()
            break

        if queue.index(i) > len(queue)/2:
            queue.rotate(1)
            cnt += 1
        else:
            queue.rotate(-1)
            cnt += 1

print(cnt)


'''
입력 예시
10 3
1 2 3

10 3
2 9 5

32 6
27 16 30 11 6 23

10 10
1 6 3 2 7 9 8 4 10 5

출력 예시
0

8

59

14
'''