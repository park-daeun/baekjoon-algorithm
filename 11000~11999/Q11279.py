import heapq
import sys

n = int(sys.stdin.readline())
arr = []

for _ in range(n):
    x = int(sys.stdin.readline())

    if x == 0:
        if not arr:
            print(0)
        else:
            print(-heapq.heappop(arr))
    else:
        heapq.heappush(arr, -x)

'''
입력 예시
13
0
1
2
0
0
3
2
1
0
0
0
0
0

출력 예시
0
2
1
3
2
1
0
0
'''