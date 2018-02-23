# Input-Output Tasks
by Pittayut Sothanakul 5910546678

I ran the tasks on a MacBook Pro (Retina, 15-inch, Mid 2015) with 2.2 GHz Intel Core i7, and got these results:

Task
-----------------------------------------------|----------------:
Read file 1-char at a time to String           |  1.333935 sec
Read file 1-char at a time to StringBuilder    |  0.005986 sec
Read file line at a time using BufferedReader  |  0.029286 sec

## Explanation of Results

StringBuilder is faster than String because new String is created an assigned to oldString so it will consume memory but StringBuuilder will use an array of chars when you use .append() it wll check if there are free space for string to append and check internall to coppy the chars of the string in the array.

StringBuffer is mutablemeans one can change the value of the object . The object created through StringBuffer is stored in the heap. StringBuffer has the same methods as the
 StringBuilder,  but each method in StringBuffer is synchronized that is StringBuffer is thread
 


