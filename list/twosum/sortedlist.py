#For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.

nums = [1, 2, 4, 6, 8, 9, 14, 15]
target = 13

def twoSums(nums,target):
    left = 0
    right = len(nums)-1
    
    while left<right:
        curr = nums[left] + nums[right]
        if(curr == target):
            return [left,right]
        if(curr > target):
            right -=1
        if(curr < target):
            left +=1
            

print(twoSums(nums,target))