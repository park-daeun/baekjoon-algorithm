import sys

def find_parents(x):
    if parent[x] != x:
        parent[x] = find_parents(parent[x])
    return parent[x]

def union_parents(a, b):
    a = find_parents(a)
    b = find_parents(b)

    if b > a:
        parent[b] = a
    else:
        parent[a] = b

n = int(sys.stdin.readline())
parent = [0] * (n+1)
for i in range(1, n+1):
    parent[i] = i

stars = [()]

for _ in range(n):
    x, y = map(float, sys.stdin.readline().split())
    stars.append((x, y))

edges = []
for i in range(1, n+1):
    for j in range(1, n+1):
        if i != j:
            cost = ((stars[i][0] - stars[j][0])**2 + (stars[i][1] - stars[j][1])**2) ** (1/2)
            edges.append((cost, i, j))

edges.sort()

res = 0
for edge in edges:
    cost, a, b = edge

    if find_parents(a) != find_parents(b):
        union_parents(a, b)
        res += cost

print(format(res, ".2f"))