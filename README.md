# Algorithm-DataStructure
Coding questions practice in JAVA  
@Author Weihua Zhu  
@Version Last update 4/19/2018
Total 115/784
## Common APIs
### HashSet
contains(Object o)

## Key Algorithms


## Tricks


## Diary
4/19/2018   
### LC264 Ugly Number II time: 18mins  
选点型DP，重点是记录该从哪个开始乘2，3和5
### LC263 Ugly Number time: 5mins    
Math题 轮流除因子  
### LC202 Happy Number time: 9mins 40s  
Simulation题 只要出现重复了必然循环 所以用HashSet存记录  
### LC258 Add Digits time: 11mins
O(1)解 考虑余数的思想  
num = 1000a + 100b + 10c + d  
那么(num % 9) 会变成 (a+b+c+d)%9，因为去掉了可以整除的部分999a,99b,9c  
然后(a+b+c+d)%9 会变成他们的和对9的余数又变成比如(m+n+l) % 9，以此类推  
直到变成一位，也就是最终result
### LC70 Climing Stairs time: 7mins 30s
入门级DP 重在理解根据依赖关系优化空间复杂度  
此题因为i只依赖于i-1和i-2，所以可以用两个temp来存储即可
### LC746 Min cost climbing stairs time: 8min 30s  
入门级DP 重在理解根据依赖关系优化空间复杂度    
此题因为i只依赖于i-1和i-2，所以可以用两个temp来存储即可  
note 最后只需返回最后一个元素和倒数第二个元素的最小值  
### LC413 Arithmetic Slices time: 12min 45s
空间O(1) 同样用temp来存前一步的结果 每步的结果都存以index i为结尾的结果。
note 存结尾的思想，变为尾部拼接。好处在于归类更清晰，而不是区间定义，尾部拼接会变成时间复杂度O(n)的问题。  
这种思想在做过的很多题都有，比如很经典的max subarray sum，就是考虑以index i结尾的subarray的结果
### LC446 Arithmetic Slices II - Subsequence time: 46mins  
Hard 想到了solution的思想（记录数列末端的元素及等差d）但是implement的时候参考了答案  
此题还需要回看 关键在于如何在复杂的条件下使用HashMap，另外考虑是否空间复杂度还可以优化，目前是O(n),  
对比下ArrayList和HashMap的使用  
TODO: 另外此题可以有follow up输出所有这些结果。应该用ArrayList储存res。