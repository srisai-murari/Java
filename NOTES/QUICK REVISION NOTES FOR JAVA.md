#### **QUICK REVISION NOTES FOR JAVA**



###### **TO COUNT NO OF DIGITS IN IN AN INTEGER**



count = (int) (Math.log(num) + 1)

count = (int) (Math.log(num) / Math.log(baseValue)) + 1 //basevalue is 10 for decimals, 2 for binary, 8 for octal





###### TO COUNT NO OF SET BITS



* if number is even then it'll have ans\[num/2] set bits (eg : if num = 10 (even) no of set bits is 10/2 = 5 => num of set bits for 5)
* if number is odd then it'll have ans\[num/2] + 1 set bits(eg: if num = 5 (odd) no of set bits is 5/2 + 1 = 2 + 1 => 3. So, no. of set bits that 3 is having is the number of set bits that 5 is having
* https://leetcode.com/problems/counting-bits/ (refer for more)

###### 

###### **REVISE BS AND 2D BS**

* files named MatrixBS and any binary search 4 hr video



###### **TIME COMPLEXITY OF BUBBLE SORTING ALGO**

* Time complexities       best        worst       average

                          O(n)        O(n^2)       O(n^2)

* best case is possible only with the help of edge case written at line 69 \& line 79
* (if swap is not done in an iteration is end the sorting as it is already sorted) **//CHECK IDE**
* Bubble sort is a stable sorting algorithm (means the algorithm doesn't change positions of equal elements
* Also called as exchange sort or sinking sort



###### **TIME COMPLEXITY OF SELECTION SORTING ALGO**

* Complexities = best        worst        average

 		 O(n^2)      O(n^2)        O(n^2)

* good for small sized arrays
* Not a stable algorithm



###### **TIME COMPLEXITY OF INSERTION SORTING ALGO**

* used most in partial sorted arrays

time complexities   best           worst         average

&nbsp;		       O(N)          O(N^2)         O(N^2)

* stable algorithm
* steps are a lot reduced when array is sorted as compared with bubble sort.
* used for smaller values of n
* works good when array is partially sorted, that's why this is used in HYBRID SORT.
