import heapq
import sys

n = int(sys.stdin.readline())
arr = []

for _ in range(n):
    x = int(sys.stdin.readline())

    if x == 0:
        if len(arr) == 0:
            print(0)
        else:
            print(heapq.heappop(arr))
    else:
        heapq.heappush(arr, x)

'''
입력 예시
9
0
12345678
1
2
0
0
0
0
32

출력 예시
0
1
2
12345678
0
'''