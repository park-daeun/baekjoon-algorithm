import sys

x, y, w, h = map(int, sys.stdin.readline().split())
print(min(x-0, w-x, y-0, h-y))