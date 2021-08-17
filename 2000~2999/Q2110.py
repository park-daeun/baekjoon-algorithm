import sys

def binary_search(house, target, start, end):
    ans = 0

    # 이진 탐색 시작
    while start <= end:
        mid = (start + end) // 2 # 중간값 설정(공유기 사이 거리)

        # 첫번째 좌표부터 보며 공유기 간 거리가 mid일 때 공유기의 개수를 구함
        cnt = 1 # 공유기의 개수
        last = house[0]
        for h in house:
            if h - last >= mid:
                cnt += 1
                last = h

        if cnt >= target:
            start = mid + 1
            ans = max(ans, mid)
        else:
            end = mid - 1
    
    return ans

n, c = map(int, sys.stdin.readline().split())
house = [int(sys.stdin.readline()) for _ in range(n)]

house.sort()
print(binary_search(house, c, 1, house[n-1]-house[0]))

'''
입력 예시
5 3
1
2
8
4
9

7 3
1
3
5
100
300
500
700

7 4
1
3
5
100
300
500
700

7 5
1
3
5
100
300
500
700

6 3
1
2
3
4
5
9

6 4
1
2
3
4
5
9

6 5
1
2
3
4
5
9

출력 예시
3

299

200

99

4

2

1
'''