import sys
import heapq

INF = int(1e9)

V, E = map(int, sys.stdin.readline().split())
K = int(sys.stdin.readline())

graph = [[] for _ in range(V+1)] # 각 노드 연결된 정보 담는 그래프
distance = [INF] * (V+1) # 최단거리 담는 리스트

for i in range(E): # 간선 정보 입력받기
    u, v, w = map(int, sys.stdin.readline().split())
    graph[u].append((v, w))

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)

        if distance[now] < dist:
            continue
    
        for i in graph[now]:
            cost = dist + i[1]
            
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

dijkstra(K)
for i in range(1, V+1):
    if distance[i] == INF:
        print("INF")
    else:
        print(distance[i])

'''
입력 예시
5 6
1
5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6

출력 예시
0
2
3
7
INF
'''