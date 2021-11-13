import sys

while True:
    A = list(map(int, sys.stdin.readline().split()))
    if A == [0, 0, 0]:
        break

    A.sort()

    if A[0]**2 + A[1]**2 == A[2]**2:
        print("right")
    else:
        print("wrong")