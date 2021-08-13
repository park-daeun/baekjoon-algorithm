import sys
from collections import deque

n = int(sys.stdin.readline())

for i in range(n):
    N, M = map(int, sys.stdin.readline().split())
    importance = list(map(int, sys.stdin.readline().split()))
    queue = deque(range(N))

    ans = []
    while queue:
        paper = queue.popleft()
        im = importance.pop(0)

        if len(importance) == 0:
            ans.append(paper)
            break

        if max(importance) > im:
            queue.append(paper)
            importance.append(im)
        else:
            ans.append(paper)
    
    print(ans.index(M)+1)



'''
입력 예시
3
1 0
5
4 2
1 2 3 4
6 0
1 1 9 1 1 1

출력 예시
1
2
5
'''