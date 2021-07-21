n, m = map(int, input().split())

num = list(input().split())
max = 0
sum = 0
i = 0

# 0 ~ n-3
for j in range(0, n-2):
    # j+1 ~ n-2
    for k in range(j+1, n-1):
        # k+1 ~ n-1
        for l in range(k+1, n):
            sum = int(num[j])+int(num[k])+int(num[l])
            if max <= sum and sum <= m:
                max = sum

print(max)

'''
사용 예시
5 21
5 6 7 8 9

10 500
93 181 245 214 315 36 185 138 216 295

코드 리뷰
브루트포스 알고리즘이므로 첫번째 사용 예시를 보고 모든 경우의 수를 생각해보았다.
리스트로 받았으므로 0,1,2/0,1,3/0,1,4/0,2,3/0,2,4/0,3,4/1,2,3/1,2,4/1,3,4/2,3,4 번째 수를 더하면 된다.
j,k,l이라 하면, j는 0 ~ 2(n-3), k는 j+1 ~ 3(n-2), l은 k+1 ~ 4(n-1) 이므로 이를 for문에 적용시켰다.
'''
