#!/usr/bin/env python
# coding: utf-8

# In[1]:


def han(x):
    split = list(str(x))
    if len(split) > 2:
        if int(split[1]) - int(split[0]) == int(split[2]) - int(split[1]):
            return True
    else:
        return True
        
n = int(input()) ; cnt = 0

for i in range(1,n+1):
    if han(i) == True:
        cnt += 1
        
print(cnt)

