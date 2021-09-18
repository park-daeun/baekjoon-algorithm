import sys
from collections import deque
import copy

n = int(sys.stdin.readline())
indegree = [0] * (n+1)
graph = [[] for _ in range(n+1)]
time = [0] * (n+1)

for i in range(1, n+1):
    a = sys.stdin.readline().split()

    time[i] = int(a[0])
    a.pop(0)

    while a[0] != '-1':
        graph[int(a[0])].append(i)
        indegree[i] += 1
        a.pop(0)
    

def topology_sort():
    q = deque()
    result = copy.deepcopy(time)

    for i in range(1, n+1):
        if indegree[i] == 0:
            q.append(i)
    
    while q:
        v = q.popleft()

        for i in graph[v]:
            result[i] = max(result[i], result[v] + time[i])
            indegree[i] -= 1

            if indegree[i] == 0:
                q.append(i)
    
    for i in range(1, n+1):
        print(result[i])

topology_sort()

'''
입력 예시
5
10 -1
10 1 -1
4 1 -1
4 3 1 -1
3 3 -1

출력 예시
10
20
14
18
17
'''