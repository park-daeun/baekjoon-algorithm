def solution(s):
    answer = 1000
    if len(s) <= 2:
        return len(s)

    for i in range(len(s)//2):
        print(i)

        j = 0
        same = 1
        res = 0
        before = ''
        while j <= len(s):
            now = s[j:j+i+1]
            print(before, now)

            if before == '':
                before = now
                j += i + 1
                continue

            if before == now:
                same += 1
            else:
                if same > 1:
                    res += i + len(str(same)) + 1
                else:
                    res += len(before)
                
                same = 1

            before = now
            j += i + 1
        
        if same > 1:
            res += i + len(str(same)) + 1
        else:
            res += len(before)
        print(res)
    
        answer = min(answer, res)

    return answer

# s = "aabbaccc"
# print(solution(s))

# s = "ababcdcdababcdcd"
# print(solution(s))

# s = "abcabcdede"
# print(solution(s))

#s = "abcabcabcabcdededededede"
#print(solution(s))

# s = "xababcdcdababcdcd"
# print(solution(s))

s = "xxxxxxxxxxyyy"
print(solution(s))

'''
입력 예시
s = "aabbaccc" 8

s = "ababcdcdababcdcd" 16

s = "abcabcdede" 10

s = "abcabcabcabcdededededede" 24

s = "xababcdcdababcdcd" 17

출력 예시
7

9

8

14

17
'''