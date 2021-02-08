#!/usr/bin/env python
# coding: utf-8

# In[2]:


def d(n):
    split = list(str(n)); int_split = []
    for i in split:
        int_split.append(int(i))
    return n + sum(int_split)

not_self = []
for i in range(1,10001):
    if d(i) < 10001:
        not_self.append(d(i))

self = set(range(1,10001)) - set(not_self)

for x in sorted(self):
    print(x)

