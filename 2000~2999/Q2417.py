import sys

def binary_search(target, start, end):
    if start > end:
        return start
    mid = (start + end) // 2

    num = mid ** 2

    if num == target:
        return mid
    elif num > target:
        return binary_search(target, start, mid-1)
    else:
        return binary_search(target, mid+1, end)

n = int(sys.stdin.readline())
print(binary_search(n, 0, n))

'''
입력 예시
122333444455555

출력 예시
11060446
'''