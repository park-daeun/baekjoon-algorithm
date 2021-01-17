#!/usr/bin/env python
# coding: utf-8

# In[1]:


n = int(input())
for i in range(1,n+1):
    print('{}{}'.format(' '*(n-i),'*'*i))

