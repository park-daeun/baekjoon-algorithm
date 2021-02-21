#!/usr/bin/env python
# coding: utf-8

# In[1]:


n = int(input()); num = n

for _ in range(n):
    word = input(); s = set()
    for i in range(len(word)):
        if set(word[i]) <= s:
            if word[i-1] != word[i]:
                num = num-1
                break
        s.add(word[i])

print(num)

