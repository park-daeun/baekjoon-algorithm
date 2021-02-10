#!/usr/bin/env python
# coding: utf-8

# In[2]:


n = int(input())

for i in range(0,n):
    answer = list(input())
    score = 0; score_list = []
    for j in answer:
        if j == 'O':
            score = score + 1
        else:
            score = 0
        score_list.append(score)
    print(sum(score_list))

