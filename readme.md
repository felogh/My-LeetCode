### 总结LeetCode刷题经验
---
##### 17/05/14
* 跳出双重for循环竟然用了break加flag，直接使用return
* 写得有点儿麻烦，多个循环其实可以写成一个

##### 17/06/04
* 最长不重复子串一开始想得有些复杂（具体见代码）
* *Median of Two Sorted Arrays* 这个题一开始想的是合并两个有序数组，不过被标为hard肯定不会这么水，所以看了别人题解，没咋看懂。。。

##### 17/07/16
* 好久没刷了，其实不难，原来对dp好像想得有点儿复杂了，还是算法练得少

##### 17/07/22
* *ZigZag-Conversion* 这个一开始以为是还原

##### 17/07/23
* 取整型长度 `String.valueOf(int).length()`
* int的取值范围 `Integer.MAX_VALUE` - `Integer.MIN_VALUE`
* *String to Integer (atoi)* 这个参考网上的写法，判断溢出是使用了 `MAX_VALUE / 10`，即在溢出之前，比较巧妙，相对于前一道题我是使用了long类型，最后强制转化为int，可能有些危险
* 关于类型转换的总结：小可转大，大转小丢失精度

##### 17/07/29
* *Palindrome Number* 有点儿水
* *Regular Expression Matching* 没懂，先放着

##### 17/08/05
* *Container With Most Water* O(n)时间复杂度
* *Integer to Roman* 一开始觉得把3999个数字写出来得了，后来看到了贪心算法，关键点在于把能选择的最大值都列出来