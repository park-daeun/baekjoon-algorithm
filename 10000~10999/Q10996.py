#!/usr/bin/env python
# coding: utf-8

# In[1]:


n = int(input())
for i in range(1,n+1):
    for i in range(1,n+1):
        if i%2:
            print('*',end='')
        else:
            print(' ',end='')
    print('\n',end='')
    for i in range(1,n+1):
        if i%2:
            print(' ',end='')
        else:
            print('*',end='')
    print('\n',end='')

