def solution(numbers):
    str_numbers = list(map(str, numbers))
    #print(str_numbers)

    order_num = []
    for num in str_numbers:
        order_num.append(num + num*(4-len(num)) + '_'*(4-len(num)))
    
    order_num.sort(reverse=True)
    #print(order_num)

    answer = ''
    if order_num[0] == '0000___':
        return '0'

    for num in order_num:
        i = num.count('_')
        num = num.replace('_','')
        if i == 3:
            num = num[:1]
        elif i == 2:
            num = num[:2]
        elif i == 1:
            num = num[:3]
        answer += num

    return answer

numbers1 = [6, 10, 2] 
numbers2 = [3, 30, 34, 5, 9]
numbers3 = [1, 2, 3, 4, 0]
print(solution(numbers1))
print(solution(numbers2))
print(solution(numbers3))

'''
입력 예시
numbers = [6, 10, 2] 
numbers = [3, 30, 34, 5, 9]

출력 예시
"6210"

"9534330"
'''