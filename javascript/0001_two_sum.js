/*
## 题目

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    Example:
```
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 ```

## 题目大意

在数组中找到 2 个数之和等于给定值的数字，结果返回 2 个数字在数组中的下标。

 ## 解题思路

这道题最优的做法时间复杂度是 O(n)。

 顺序扫描数组，对每一个元素，在 map 中找能组合给定值的
*/
const twoSum = (nums, target) => {
    if(nums.length <2 ){return [-1,-1]}
    const numberHash = {}
    for(let i = 0; i < nums.length; i++) {
        const num = nums[i]
        if( numberHash[target-num] != undefined){
            return [numberHash[target-num], i]
        }
        numberHash[num] = i
    }
    return [];
};

test('twoSum', () => {
    expect( twoSum([2,7,11,15],9))
})

