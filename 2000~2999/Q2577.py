#!/usr/bin/env python
# coding: utf-8

# In[1]:


a = int(input())
b = int(input())
c = int(input())

num = list(str(a*b*c))

for i in range(0,10):
    print(num.count(str(i)))

