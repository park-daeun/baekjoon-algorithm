n = int(input())
testCase = list(map(int, input().split()))
numOfPrime = 0

for i in testCase:
    checkNum = 0

    if i == 1:
        continue

    for j in range(2, i):
        if i % j == 0:
            checkNum = checkNum + 1
    if checkNum == 0:
        numOfPrime = numOfPrime + 1

print(numOfPrime)
