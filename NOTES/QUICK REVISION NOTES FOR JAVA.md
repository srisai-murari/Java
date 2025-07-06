#### **QUICK REVISION NOTES FOR JAVA**



**⭐APPLY BINARY SEARCH WHEN A SORTED ARRAY IS FOUND ⭐**

**⭐APPLY CYCLIC SORT WHEN NUMBERS FROM 1 TO N (or) 0 TO N IS GIVEN⭐**





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

 		       O(N)          O(N^2)         O(N^2)

* stable algorithm
* steps are a lot reduced when array is sorted as compared with bubble sort.
* used for smaller values of n
* works good when array is partially sorted, that's why this is used in HYBRID SORT.



###### **TIME COMPLEXITY OF CYCLIC SORTING ALGO**

* MOST USED WHEN GIVEN ARRAY STARTS FROM 1 TILL N
* Time complexities             worst           best           average

 				O(N)            O(N)             O(N)





\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_END\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



###### **STRINGS:**



* String pool is a separate memory structure in heap only for strings : (use) to not create multiple objects and make code optimized
* Strings are immutable
* String    str =   "Man";

  Datatype  var  =  object;



* Strings are immutable because

 	Scenario : Imagine a few persons are named "John" and the String "John" is stored in string pool and everyone pointing to the same object "John"

 		  If one person wants to change his name to "Johnny" then others who are pointing to the same object "John" will get their name changed too.



**That's why strings are immutable**

* Use "new" keyword to create a new object of same values
* Use ".equals()" method to compare 2 strings and not == operator
* To convert an integer to String use "String s = Integer.toString(n);"
* Anything passed in println() function, everything is converted to string using "toString();"
* When a string is concatenated with an integer (int) the integer is converted into a wrapper class Integer.
* ###### **TYPE CASTING**
* int a = 'a' - 0;
* char = (char) (a);
* char ch = (char)('a' + 0);
* 
* //to convert things into ascii
* int b = 'a' + 'b';
* 
* \_\_\_\_\_end\_\_\_\_\_\_
* when an object is present in "sout" the "println" calls toString() to print the object values
* operator overloading is not present in java
* split(), strip(), trim()
* 
