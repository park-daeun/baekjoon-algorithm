#!/usr/bin/env python
# coding: utf-8

# In[1]:


A,B,C = map(int, input().split())
print((A+B)%C)
print(((A%C)+(B%C))%C)
print((A*B)%C)
print(((A%C)*(B%C))%C)

