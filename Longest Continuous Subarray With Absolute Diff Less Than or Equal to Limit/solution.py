from collections import deque
def longestSubarray(nums, limit):
# """
# :type nums: List[int]
# :type limit: int
# :rtype: int
# """
    minQ = deque()
    maxQ = deque()

    s, e = 0, 0
    sol = 1

    while e < len(nums):
        cur = nums[e]
        while len(minQ) > 0 and nums[minQ[-1]] >= cur: minQ.pop()
        minQ.append(e)
        while len(maxQ) > 0 and nums[maxQ[-1]] <= cur: maxQ.pop()
        maxQ.append(e)
        
        minVal = nums[minQ[0]]
        maxVal = nums[maxQ[0]]
        
        if maxVal - minVal > limit:
            
            if s == minQ[0]: 
                minQ.popleft()
            if s == maxQ[0]: 
                maxQ.popleft()
            s += 1
        
        else:
            sol = max(sol, e - s + 1)
            e += 1

    return sol

longestSubarray([8,2,4,7,8,2], 4)