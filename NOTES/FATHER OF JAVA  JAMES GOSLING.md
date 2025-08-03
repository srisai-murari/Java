FATHER OF JAVA : JAMES GOSLING

FOUNDER COMPANY : SUN MICROSYSTEMS

YEAR : 1995

FOUNDER COMPANY WAS TAKEN BY ORACLE



VARIABLE DECLARATION IS DONE AT COMPILE TIME

MEMORY ALLOCATION FOR A VARIABLE IS DONE AT RUN TIME



Sometimes, float can be inaccurate like 0.03 - 0.04 = 0.00100000**3**

                                                                   👆extra value (kinda inaccurate)



So, to remove this we use BigDecimal which gives accurate ans

---

Access modifiers : protected



Only subclass reference variable can access the protected variables

//Scenario : 'A' is parent class \& 'B' is subclass of 'A' and 'A' contains protected int num;



Now, in some other package



psvm {

 	...

 	B bObj = new B();

 	int n = bObj.num;✅✅ //only subclass can access protected elements from other packages

 	A aObj = new A();

 	int n = aObj.num; ❌❌ //Cannot access protected elements through other packages without a subclass

//because A doesn't know that a child class B exists. So, a protected element cannot be accessed through another package without Subclass B

}



---



whatever you are going to print using sout in java it uses \*datatype\*.toString and prints it as a string





if you try to print null using sout without using "" then it doesn't search for null.objectValue it just prints null

as the exception return(obj == null) ? null : obj.toString();

                  👆👆 popular exception

Integer num = new Integer(56);

can do a lot of stuff with num.(...)



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_RECURSIONS

TAIL RECURSION : If the final return statement has nothing to do other than returning then that is called tail recursion

ex : return n;



NOT TAIL : If the final return statement includes something that is not only returning single value but also calculating the return value



ex: return f(n-1) + f(n);



refer this "C:\\Users\\srisa\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-05-19 190809.png"





01010 - \[01010 \& 10110] = 01010 - \[00010] = 01000

01000 - \[01000 \& 11000] = 01000 - \[01000] = 0

ust use IntelliJ to:



Commit (Ctrl + K)



Push (Ctrl + Shift + K)



All new work will sync with GitHub!













IMP\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

sout(    +       );

         👆

this '+' can be used only for primitives (like int,float,byte,short,long,double,char...) or when atleast one string included in the print line



eg :

sout (new ArrayList<>() + new Integer(59)); //gives an error

but

sout(new ArrayList<>() + "" + new Integer(50));

now you can do a lot of stuff with num (as num is a wrapper class)



{2,3,5,9,14,16,18,19,20,21,22,24,29,30}

 

 0 1 2 3 4   5  6  7  8  9 10 11 12 13

     s       e  s                   e

start = 0

end = 1









if arr\[mid] < target





if arr\[end] ==  mid

print arr\[end]





if target > arr\[end]

start = end+1 = 2

end = start\*2+1 = 5



if target < arr\[end]

bs(arr, start, end)

{19,18,16,14,9,5,3,2}

 

 0 1 2 3 4 5 6





while(start < end)

mid = (start + end)/2

if mid > mid+1

   return mid

else if mid < mid-1

 	return mid-1

else if start > mid

 	end = mid-1

else if start < mid

 	start = mid +1







1 2 3 4 5 6

