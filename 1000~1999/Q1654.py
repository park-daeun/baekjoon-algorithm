import sys

def binary_search(arr, target, start, end):
    ans = 0
    while start <= end:
        mid = (start + end) // 2

        cnt = 0
        for a in arr:
            cnt += a // mid
        #print(mid, cnt)
        
        if cnt >= target:
            ans = max(mid, ans)
            start = mid + 1
        else:
            end = mid - 1
    
    return ans

k, n = map(int, sys.stdin.readline().split())
arr = [int(sys.stdin.readline()) for _ in range(k)]

print(binary_search(arr, n, 1, max(arr)))

'''
입력 예시
4 11
802
743
457
539

출력 예시
200
'''