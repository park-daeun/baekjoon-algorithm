#!/usr/bin/env python
# coding: utf-8

# In[1]:


n = int(input())

a = []
for i in range(n//5 + 1):
    if not((n-i*5)%3):
        a.append(i+(n-i*5)/3)
        
try:
    print(int(min(a)))
except:
    print(-1)

