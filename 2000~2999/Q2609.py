import math

a, b = map(int, input().split())
g = math.gcd(a, b)

print(g, g * a//g * b //g, sep='\n')