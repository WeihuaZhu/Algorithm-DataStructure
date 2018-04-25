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

## Common mistakes
- forget to write return
- finding max or min, forget to update the min and max value

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
TODO: 另外此题可以有follow up输出所有这些结果。应该用ArrayList储存res  

4/20/2018  
### LC650 2 Keys Keyboard time: 40min
优化DP
### LC279 Perfect Squares time: 10min
尾部拼接 击败了90% 但是否还能优化？  
### LC223 Rectangle Area time: 6min 44s
先判断是否overlap 代码模块化  
### LC171 Excel Sheet Column Number time: 5min 25s
记住Math.pow 和 Math.sqrt都是返回double值  
### LC168 Excel Sheet Column Title time: 36min 37s  
用StringBuilder + reverse String  
一定要保证真实的O(n)复杂度  

4/21/2018  
### LC357 Count Numbers with Unique Digits time: 7min
O(n) 排列组合问题  
### LC303. Range Sum Query - Immutable time: 9min
prefix sum的应用
### LC304. Range Sum Query 2D time： 30min
每一行用prefix sum

4/22/2018
### LC343 Integer Break time: 13min
一个DP方法 一个数学方法  
### LC172 Factorial Trailing Zeroes time: 7min
2和5才能出现0  
### LC268 Missing Number time: 2min 43s
注意所有array元素有限定范围情况下的优化
### LC287. Find the Duplicate Number time: 21min 13s
Floyd's Tortoise and Hare (Cycle Detection) 算法  
双指针检测link cycle entry point LC linkedlist cycle II
### LC645. Set Mismatch time: 6min
多种方法总结  

4/23/2018  
### LC697 Degree of an Array time: 20min [1/100题]
先找度 再头尾双指针找区间
follow up 包含所有出现频率最高的元素的最短区间：min start和max end  
### LC632 Smallest Range time: 35min [2/100题]
双针模型，第一遍写的TLE  
优化：用PriorityQueue存并更新 复杂度O(nlog(k)), n is the total number of elements in all lists,  
k refers to the total number of lists.  
follow up 每个列表至少有2个元素在里面（小trick）  
### LC547 Friend Circles time: 15min [3/100题]
Union Find应用  
注意用rank数组存储来加速 需要回看
### LC200 Number of Islands time: 20min
Union Find应用 但是速度慢  
需要回看 优化

4/24/2018
### LC543 Diameter of Binary Tree time 20min [4/100题]
O(N) follow up: 如果边有weight （解法没有区别）  
### LC451 Sort Characters By Frequency time: 11min 20s [5/100题]
bucket sort 吊桶模型  
### LC443 String Compression time: 10min [6/100题]
easy