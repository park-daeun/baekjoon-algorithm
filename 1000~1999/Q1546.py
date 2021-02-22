#!/usr/bin/env python
# coding: utf-8

# In[1]:


n = int(input())
score = list(map(int, input().split()))

new = []
for i in score:
    new.append(i/max(score)*100)
    
print(sum(new)/n)

