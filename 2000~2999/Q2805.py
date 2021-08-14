import sys

def binary_search(H, target, start, end, max_h):
    if start > end:
        return max_h
    
    mid = (start + end) // 2
    sum = 0

    # 잘랐을 때 총 높이
    for i in H:
        if (i - mid) > 0:
            sum += (i - mid)

    # 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
    if sum < target:
        return binary_search(H, target, start, mid-1, max_h)
    else:
        max_h = max(mid, max_h) # 높이의 최댓값
        
        if sum == target:
            return mid
        else: # 충분한 경우 덜 자르기(오른쪽 부분 탐색)
            return binary_search(H, target, mid+1, end, max_h)

n, m = map(int, sys.stdin.readline().split())
H = list(map(int, sys.stdin.readline().split()))

print(binary_search(H, m, 0, max(H), 0))

'''
입력 예시
4 7
20 15 10 17

5 20
4 42 40 26 46

출력 예시
15

36
'''