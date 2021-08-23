import sys

INF = int(1e9)

V, E = map(int, sys.stdin.readline().split())
graph = [[INF] * (V+1) for _ in range(V+1)]

for _ in range(E):
    a, b, c = map(int, sys.stdin.readline().split())
    graph[a][b] = c

for k in range(1, V+1):
    for a in range(1, V+1):
        for b in range(1, V+1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

ans = INF
for i in range(1, V+1):
    ans = min(ans, graph[i][i])

if ans == INF:
    print(-1)
else:
    print(ans)

'''
입력 예시
3 4
1 2 1
3 2 1
1 3 5
2 3 2

출력 예시
3
'''