import sys

A = map(int, sys.stdin.readline().split())
sum = 0
for a in A:
    sum += a**2

print(sum%10)