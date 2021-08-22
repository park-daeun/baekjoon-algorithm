import heapq
import sys

n = int(sys.stdin.readline())
min_heap = []
max_heap = []

# 왼쪽 값은 max_heap, 오른쪽 값은 min_heap으로 구성하고, 중앙값은 항상 max_heap의 첫번째 값
# 1. 왼쪽과 오른쪽 원소의 길이가 같다면, 왼쪽에 새 값을 저장
# 2. 만약 오른쪽 heap 값보다 왼쪽 heap 값이 더 크다면, 오른쪽과 왼쪽 원소의 값을 바꿔준다.

for i in range(n):
    x = int(sys.stdin.readline())
    
    if len(min_heap) == len(max_heap):
        heapq.heappush(max_heap, (-x, x))
    else:
        heapq.heappush(min_heap, (x, x))
    
    if min_heap and max_heap[0][1] > min_heap[0][1]:
        left = heapq.heappop(max_heap)[1]
        right = heapq.heappop(min_heap)[1]
        heapq.heappush(min_heap, (left, left))
        heapq.heappush(max_heap, (-right, right))

    #print(max_heap, min_heap)
    print(max_heap[0][1])

'''
입력 예시
7
1
5
2
10
-99
7
5

11
1 [1] 
5 [1,5]
2 [1,5,2]
10 [1,5,2,10]
-99 [-99,1,2,10,5]
7 [-99,1,2,10,5,7]
6 [-99,1,2,10,5,7,6]
15 [-99,1,2,10,5,7,6,15]
25 [-99,1,2,10,5,7,6,15,25]
30 [-99,1,2,10,5,7,6,15,25,30]
21 [-99,1,2,10,5,7,6,15,25,30,21]

[-99, 1, 2, 5, 6, 7, 10, 15, 21, 25, 30]

11
1
5
2
10
-99
7
6
15
-10
2
21

출력 예시
1
1
2
2
2
2
5
'''