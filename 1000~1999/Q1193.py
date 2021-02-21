#!/usr/bin/env python
# coding: utf-8

# In[1]:


x = int(input())

a= 1; cnt = 0; n = x
while 1:
    cnt += 1
    if n - a <= 0:
        break
    n = n-a
    a += 1

sum = 1
for i in range(1,cnt):
    sum += i

if cnt%2:
    print(str(cnt+1-(x-sum+1))+'/'+str(x-sum+1))
else:
    print(str(x-sum+1)+'/'+str(cnt+1-(x-sum+1)))

