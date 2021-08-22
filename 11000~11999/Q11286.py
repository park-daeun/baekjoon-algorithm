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
            print(heapq.heappop(arr)[1])
    else:
        heapq.heappush(arr, (abs(x), x))
    
    #print(arr)

'''
입력 예시
18
1
-1
0
0
0
1
1
-1
-1
2
-2
0
0
0
0
0
0
0

출력 예시
-1
1
0
-1
-1
1
1
-2
2
0
'''