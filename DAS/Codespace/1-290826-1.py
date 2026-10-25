'''
Given an integer array nums, return the length of the longest contiguous subarray whose sum equals k.

Example:

nums = [1, 2, 3, 1, 1, 1]
k = 3

Output = 3

Suppose:

nums = [1, -1, 5, -2, 3]
k = 3

The longest valid subarray is:

[1, -1, 5, -2] → sum = 3 → length = 4

Your brute-force approach can find it.

Now answer these three things:

A.

Write the brute-force Python code.

B.

What is its exact time complexity?

Don't just say O(n²)—explain why.

C.

Most importantly:

If I tell you:

"Your O(n²) solution works, but I want O(n). Can you optimize it?"

'''
k = 3
nums = [1,-1,5,-2]
le = 0

for i in range(len(nums)):
    l=0
    sum=0
    if sum == k :
        if le<l:
            le=l
    for j in range(i,len(nums)):
        sum+=nums[j]
        l+=1
        if(sum==k):
            if(le<l):
                le=l

print(le)    