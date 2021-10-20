import sys

INF = int(1e9)

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

graph = [[INF] * (n+1) for _ in range(n+1)]

for i in range(1, n+1):
    graph[i][i] = 0

for _ in range(m):
    a, b, c = map(int, sys.stdin.readline().split())
    graph[a][b] = min(graph[a][b], c)


trace = [[[] for _ in range(n+1)] for _ in range(n+1)]

for i in range(1, n+1):
    for j in range(1, n+1):
        if i != j:
            trace[i][j].append(i)

for k in range(1, n+1):
    for a in range(1, n+1):
        for b in range(1, n+1):
            if graph[a][b] > graph[a][k] + graph[k][b]:
                graph[a][b] = graph[a][k] + graph[k][b]
                trace[a][b] = trace[a][k] + trace[k][b]

for i in range(1, n+1):
    for j in range(1, n+1):
        if i != j:
            trace[i][j].append(j)

for i in range(1, n+1):
    for j in range(1, n+1):
        if graph[i][j] == INF:
            print(0, end=' ')
        else:
            print(graph[i][j], end=' ')
    print()

for i in range(1, n+1):
    for j in range(1, n+1):
        if graph[i][j] == 0 or graph[i][j] == INF:
            print(0)

        else:
            print(len(trace[i][j]), end=' ')
            print(*trace[i][j], sep=' ')