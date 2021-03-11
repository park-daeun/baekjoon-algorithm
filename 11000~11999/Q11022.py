#!/usr/bin/env python
# coding: utf-8

# In[3]:


t = int(input())
for i in range(1,t+1):
    a,b = map(int, input().split())
    print("Case #{}: {} + {} = {}".format(i,a,b,a+b))

