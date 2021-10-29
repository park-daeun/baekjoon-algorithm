import sys

n = int(sys.stdin.readline())
dp = [0] * n

for i in range(n):
    t, p = map(int, sys.stdin.readline().split())

    for j in range(i + t, n):
        if dp[j] < dp[i] + p:
            dp[j] = dp[i] + p 
    
    if i + t <= n:
        dp[i] = dp[i] + p

print(max(dp))

'''
입력 예시 / 출력 예시
7
3 10
5 20
1 10
1 20
2 15
4 40
2 200
/
45

10
1 1
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 10
/
55

10
5 10
5 9
5 8
5 7
5 6
5 10
5 9
5 8
5 7
5 6
/
20

10
5 50
4 40
3 30
2 20
1 10
1 10
2 20
3 30
4 40
5 50
/
90
'''