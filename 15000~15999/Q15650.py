import sys
n, m = map(int, sys.stdin.readline().split())

visit = [False] * (n+1)
visited = [False] * (n+1)
ans = []

def dfs(n, m):
    if len(ans) == m:
        print(*ans, sep=' ')
        #ans.pop()
        return
    
    for i in range(1, n+1):
        #print(i, visited, ans)

        if visited[i] == False:
            visited[i] = True
            ans.append(i)
            print(i, visited, ans)
            print("         ", end=' ')
            dfs(n, m)
            visited[i] = False
            ans.pop()
        
        #visited[i] = True

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
2 3
2 4
3 4

1 2 3 4
'''