l = int(input())
s = input()

sum = 0
for i in range(l):
    sum += 31**i * (ord(s[i]) - 96)

print(sum % 1234567891)