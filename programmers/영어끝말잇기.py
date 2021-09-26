def solution(n, words):
    answer = [0, 0]

    turn = dict(zip(list(range(n+1)), list([0 for _ in range(n+1)])))
    d = dict({words[0]:0})

    print(turn, d)

    last = words[0][-1]
    i = 2
    turn[1] = 1
    words.pop(0)
    
    for w in words:
        #print(i, turn, d, w, last)

        if last != w[0] or w in d:
            answer = [i, turn[i]+1]
            break

        last = w[-1]
        turn[i] = turn[i] + 1
        d[w] = 0

        i += 1

        if i > n:
            i = 1

    return answer

n = 3
words = ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
print(solution(n, words))

n = 5
words = ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]
print(solution(n, words))

n = 2
words = ["hello", "one", "even", "never", "now", "world", "draw"]
print(solution(n, words))
'''
입력 예시
n = 3
words = ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]

n = 5
words = ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]

n = 2
words = ["hello", "one", "even", "never", "now", "world", "draw"]

출력 예시
[3, 3]

[0, 0]

[1, 3]
'''