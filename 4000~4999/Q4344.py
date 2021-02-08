#!/usr/bin/env python
# coding: utf-8

# In[1]:


c = int(input())

for i in range(c):
    case = list(map(int, input().split()))
    n = case[0]; case.remove(case[0])
    
    ave = sum(case)/n; high_n = 0
    
    for j in case:
        if j > ave:
            high_n += 1

    print('%0.3f' %(high_n/n*100) + '%')

