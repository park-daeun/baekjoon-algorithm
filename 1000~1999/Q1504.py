import sys
import heapq

INF = int(1e9)

N, E = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(N+1)]
distance = [INF] * (N+1)

for i in range(E):
    a, b, c = map(int, sys.stdin.readline().split())
    graph[a].append((b, c))
    graph[b].append((a, c))

v1, v2 = map(int, sys.stdin.readline().split())

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)

        if dist > distance[now]:
            continue

        for i in graph[now]:
            cost = dist + i[1]
            
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

# 1-v1-v2-N 또는 1-v2-v1-N 구하기
dijkstra(v1)
start_to_v1 = distance[1]
v1_to_end = distance[N]
v1_to_v2 = distance[v2]

distance = [INF] * (N+1)

dijkstra(v2)
start_to_v2 = distance[1]
v2_to_end = distance[N]

ans = min(start_to_v1+v1_to_v2+v2_to_end, start_to_v2+v1_to_v2+v1_to_end)

if ans >= INF:
    print(-1)
else:
    print(ans)

'''
입력 예시
4 6
1 2 3
2 3 3
3 4 1
1 3 5
2 4 5
1 4 4
2 3

출력 예시
7
'''