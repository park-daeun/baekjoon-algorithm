import heapq

def solution(scoville, K):
    answer = 0
    heap = []

    for s in scoville:
        heapq.heappush(heap, (s, s))
    
    while True:
        f1 = heapq.heappop(heap)
        if f1[0] >= K:
            return answer
        
        if len(heap) == 0:
            return -1

        f2 = heapq.heappop(heap)

        mix = f1[0] + 2 * f2[0]
        heapq.heappush(heap, (mix, mix))
        answer += 1


scoville1 = [1, 2, 3, 9, 10, 12]
K1 = 7
print(solution(scoville1, K1))

scoville2 = [1, 0, 1, 0, 1, 2, 0, 0]
K2 = 7
print(solution(scoville2, K2))

'''
입력 예시
scoville = [1, 2, 3, 9, 10, 12]
K = 7

출력 예시
2
'''