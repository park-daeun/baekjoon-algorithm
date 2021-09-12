# def solution(citations):
#     citations.sort()
#     h = 0

#     for i in range(1, max(citations)+1):
#         up = 0
#         down = 0

#         for c in citations:
#             if c >= i:
#                 up += 1
#             else:
#                 down += 1

#         if up >= i and down <= i:
#             h = max(h, i)
#             #print(h)

#         #print(i, up, down)

#     return h

citations = [3, 0, 6, 1, 5]
#print(solution(citations))
citations.sort(reverse=True)
print(citations)
print(list(map(min, enumerate(citations, start=1))))

answer = max(map(min, enumerate(citations, start=1)))
print(answer)
'''
입력 예시
citations = [3, 0, 6, 1, 5]

출력 예시
3
'''