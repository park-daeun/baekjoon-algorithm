import sys

n = int(sys.stdin.readline())
m = 0
while(True):
    digit = len(str(m))
    sum = m
    for i in range(0, digit):
        sum += int(str(m)[i])

    if n == sum:
        print(m)
        break

    if n <= m:
        print(0)
        break
    m += 1

'''
입력 예시
256

216

출력 예시
245

198

코드 리뷰
브루트포스 알고리즘이므로 m이 0부터 시작해서 하나하나씩 다 해보는 방법을 생각했다.
시간 제한에 걸리진 않았지만 시간이 꽤 오래걸린다.
'''
