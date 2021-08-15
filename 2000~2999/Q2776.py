import sys

def binary_search(arr, target, start, end):
    while start <= end:
        mid = (start + end) // 2

        if target == arr[mid]:
            return 1
        elif target < arr[mid]:
            end = mid - 1
        else:
            start = mid + 1

    return 0

T = int(sys.stdin.readline())
for i in range(T):
    n = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))

    m = int(sys.stdin.readline())
    x = list(map(int, sys.stdin.readline().split()))

    arr.sort()
    for j in x:
        print(binary_search(arr, j, 0, n-1))
        
'''
입력 예시
1
5
4 1 5 2 3
5
1 3 7 9 5

출력 예시
1
1
0
0
1
'''