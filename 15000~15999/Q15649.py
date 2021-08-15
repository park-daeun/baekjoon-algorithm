import sys
# from itertools import permutations

# n, m = map(int, sys.stdin.readline().split())

# arr = list(range(1, n+1))
# per = list(permutations(arr, m))

# for p in per:
#     print(*p, sep=' ')

n, m = map(int, sys.stdin.readline().split())
visited = [False] * (n+1)
ans = []

def dfs(n, m):
    if len(ans) == m:
        print(*ans, sep=' ')
        return
    
    for i in range(1, n+1):
        #print("            i:", i)
        print(visited, ans)
        if not visited[i]:
            visited[i] = True
            ans.append(i)
            #print("True 변경!!", visited, ans)

            dfs(n, m)

            visited[i] = False
            ans.pop()
            #print("종료!!!", visited, ans)

dfs(n, m)

'''
입력 예시
3 1

4 2

4 4

출력 예시
1
2
3

1 2
1 3
1 4
2 1
2 3
2 4
3 1
3 2
3 4
4 1
4 2
4 3

1 2 3 4
1 2 4 3
1 3 2 4
1 3 4 2
1 4 2 3
1 4 3 2
2 1 3 4
2 1 4 3
2 3 1 4
2 3 4 1
2 4 1 3
2 4 3 1
3 1 2 4
3 1 4 2
3 2 1 4
3 2 4 1
3 4 1 2
3 4 2 1
4 1 2 3
4 1 3 2
4 2 1 3
4 2 3 1
4 3 1 2
4 3 2 1
'''