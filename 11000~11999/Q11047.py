import sys

# n: 동전 종류의 수, k: 동전을 합한 가치. 값.
n, k = map(int, sys.stdin.readline().split())
A = []  # 동전의 가치(오름차순)
ans = 0  # K원을 만드는데 필요한 동전 개수의 최솟값

for i in range(n):
    A.append(int(sys.stdin.readline()))

for i in reversed(A):
    if k >= i:
        ans += (k - k % i) // i
        k %= i

print(ans)

'''
입력 예시
10 4200
1
5
10
50
100
500
1000
5000
10000
50000

10 4790
1
5
10
50
100
500
1000
5000
10000
50000

출력 예시
6

12

코드 리뷰
reversed(list) : 리스트 반대로 정렬 -> list 뒤부터 앞으로 순회할 때!
이코테 책 예제에 있던 동전 문제를 떠올려 풀었더니 금방 풀었다.
'''
