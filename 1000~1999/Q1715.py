import sys
import heapq

n = int(sys.stdin.readline())
nums = []

for _ in range(n):
    num = int(sys.stdin.readline())
    heapq.heappush(nums, num)

ans = 0
while len(nums) > 1:
    num1 = heapq.heappop(nums)
    num2 = heapq.heappop(nums)

    sum = num1 + num2
    ans += sum
    heapq.heappush(nums, sum)

print(ans)