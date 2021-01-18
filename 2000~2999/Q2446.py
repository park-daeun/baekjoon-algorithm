#!/usr/bin/env python
# coding: utf-8

# In[1]:


n = int(input())
for i in range(1,n+1):
    blank = i-1
    star = n*2 - 1 - blank*2
    print(' '*blank + '*'*star)

for i in range(n-1,0,-1):
    blank = i-1
    star = n*2 - 1 - blank*2
    print(' '*blank + '*'*star)

