***Collection of problems and their solutions from the course on Java Start of the school Prog.kiev.ua
Author Tsymbalyuk A.N.***

**w1)** Write a program that reads a 5-digit number from the keyboard
and displays the numbers it consists of.
For example: The number 54698 is read Out:
5 4 6 9 8

**w2)** Write a program that calculates and displays the area
triangle if its sides are known.

**w3)** Write a program that calculates and displays the length
circle, if its radius is read from the keyboard.

**w4)** Write a program that counts 4 numbers from the keyboard and
will display the largest one.

**w5)** There is a nine-storey building with 4 entrances. Entrance number
starts with one. There are 4 apartments on one floor. Write a program
which will receive the apartment number from the keyboard, and display on
which floor, which entrance is this apartment. If such
there is no apartment in this house, then you need to inform the user about it.


**w6)** Determine the number of days in the year that the user enters.
There are 366 days in a leap year, while 365 in a regular year.
Leap years are all years divisible by 4 per
with the exception of centuries, which are not divisible by 400.

**w7)** A triangle exists only if the sum of any two
its sides are larger than the third. Given: a, b, c - sides of the alleged
triangle. Write a program that will indicate such
triangle or not.

**w8)** There is a circle with a center at the origin and a radius of 4.
The user enters the x and y coordinates of the point from the keyboard.
Write a program that determines whether this point lies inside
circle or not.

**w9)** Given triangle coordinates of vertices А (0,0), В (4,4), С (6,1).
The user enters the x and y coordinates of the point from the keyboard.
Write a program that determines whether this point lies inside the triangle or not.

**w10)** Check if a 4-digit number is a lucky ticket.
A four-digit number is given. Check if it is a "lucky ticket".
Note: a lucky ticket is a number in which - for even
the number of digits in a number the sum of the digits of its left half is equal to the sum of the digits
his right half. For example, consider the number 1322. Its left half
is 13 and the right is 22, and it is a lucky ticket (since 1 + 3 = 2 + 2)

**w11)** A six-digit number is entered from the keyboard.
Check if it is a palindrome. Note: palindrome is called
a number, word or text that is read equally from left to right and right
left. For example, these are the numbers 143341, 5555, 7117, etc.

**w12)** Draw "wallpaper" using loops.
Moreover, the number of bands must be entered from the keyboard.
There are 7 stripes in the example. \
--- +++ --- +++ --- +++ --- \
--- +++ --- +++ --- +++ --- \
--- +++ --- +++ --- +++ --- \
--- +++ --- +++ --- +++ --- \
--- +++ --- +++ --- +++ ---

**w13)** Calculate the factorial of the number - n entered from the keyboard using a loop
(4 <n <16). The factorial of a number is the product of all numbers from that number to 1.
For example 5! = 5 * 4 * 3 * 2 * 1 = 120

**w14)** Print the multiplication table for 5. preferably print
1 x 5 = 5, 2 x 5 = 10, not just 5, 10, etc.

**w15)** Display the rectangle from *. Moreover, the height and width
rectangles are entered from the keyboard. For example, below is a rectangle
with a height of 4 and a width of 5.
<pre>
@@@@@
@   @
@   @
@@@@@
</pre>

**w16)** Using a loop (only one) draw such a shape. Moreover, the maximum height of this figure is entered from the keyboard (in the example, the maximum height is 4)
<pre>
*
**
***
****
***
**
*
</pre>


**w17)** Use loops to display all prime numbers from 1 to 100.
Prime number - a number that is divisible only by one, or
on itself. The first primes are 2,3,5,7 ...

**w18)** Display the "hourglass" whose maximum width
read from the keyboard (odd number). In the example, the width is 5.
<pre>
    *****
     ***
      *
     ***
    *****
</pre>

**w19)** Given an array {0,5,2,4,7,1,3,19} - write a program to count
odd digits in it.

**w20)** Write code to be able to create an array of integers
(the size is entered from the keyboard) and the possibility of filling each of it
item manually. Print this array to the screen.

**w21)** Create an array of random numbers (15 elements).
Create a second array twice as large, the first 15 elements
must be equal to the elements of the first array, and the rest of the elements
fill in with double the initial value. for example

Was → {1,4,7,2}
Became → {1,4,7,2,2,8,14,4}

**w22)** Enter a string of text from the keyboard - implement a program to
the possibility of counting the number of characters - 'b' in this line, with the output
result on the screen.

**w23)** "Reverse the array". Those. write a program that
will rotate the underlying array 90,180,270 degrees clockwise.
(You cannot use an additional array when executing the task).

**w24)** Write code to flip the array
(7,2,9,4) -> (4,9,2,7). - the array can be of arbitrary length.
 (When performing a task, you cannot use an additional array
 
**w25)** Enter from the keyboard a number (up to a billion) that represents
 the amount of dollars and cents of the user. Output this amount in words.
 For example:
 How much money do you have?
 123.34
 You have: one hundred twenty three dollars thirty four cents
 
 **w26)** Write a method that will return the maximum number from an array of integers.
 
 **w27)** Implement a method whose parameters are -
 integer, real and string. It returns the concatenation
 strings with the sum of a real and an integer.
 
 **w28)** Implement a method that draws a rectangle on the screen from
 asterisks "*" - its parameters will be integers that
 describe the length and width of such a rectangle.
 
 **w29)** Write a method that implements linear search
 element in an array of integers. If there is such an element in the array then
 return its index, if not then the method should return a number - "-1"
 
 **w30)** Write a method that will return the number of words in a line of text.
 
 **w31)** There are such sequences of numbers \
 0, 2,4,6,8,10,12 \
 1,4,7,10,13 \
 1,2,4,8,16,32 \
 1,3,9,27 \
 1,4,9,16,25 \
 1,8,27,64,125 \
 Implement a program that prints the next member of this sequence
 (or similar). For example, the user enters the string 0,2,4,6,8,10,12
 the response of the program should be the number 14.
 
 **w32)** Number-palindrome on both sides (right to left and left to right)
 reads the same. Largest palindrome number obtained
 by multiplying two two-digit numbers - 9009 = 91 × 99.
 Find the largest palindrome obtained by multiplying two three-digit numbers.
 
 **w33)** There is an array {1,2,3,4,5} - the size of the array can be arbitrary.
 Write a program that will display all possible combinations of these numbers on the screen.
 The attention of repetitions should not be.
 
 **w34)** Write a program that will return the number of milliseconds
 from the same date last month to today's date.
 For example, if today is August 3, then find out how many milliseconds have passed since July 3.
 
 **w35)** Write your own version of the Arrays.toString () method for int [].
 
 **w36)** Enter a binary number from the console. Translate it to
 decimal and display (“10” -> 2).
 
 **w37)** Display 10 lines with the value of Pi. Moreover, in the first
 the line should have 2 decimal places, in the second 3, in the third 4, etc.
 
 **w38)** Enter date from console. Compare it with the current date in the system.
 Display the differing parts (year, month) on the screen.
 
 **w39)** Hamming distance between two binary numbers -
 it is the number of positions at which the bits differ.
 For example: 
 <pre>
 117 = 0 1 1 1 0 1 0 1
  17 = 0 0 0 1 0 0 0 1
  </pre>
 ----------------------------------- \
 H = 0 + 1 + 1 + 0 + 0 + 1 + 0 + 0 = 3 - Hamming distance between (117,17)
 You are given two positive integers (N, M) in decimal form. You
 it is necessary to calculate the Hamming distance between these two
 numbers.
 
 **w40)** Little Johnny, while sitting in the lesson, wrote the same numbers in a row. When Marya
 Ivanovna took the notebook from him; there were several rows of numbers. Write
 a program that will determine the minimum number that Johnny wrote for example:
 11111111 => 1 \
 12121212 => 12 \
 121121121 => 121 \
 
 **w41)** Create a console "text editor" with the ability
 saving the typed text to a file.
 
 **w42)** Write a method to save a 2D text file
 an array of integers.
 
 **w43)** Implement a method that will list all
 directories that "lie" in the directory that will be a parameter of this method.
 
 **w44)** Write a method to read a 2D array from a file
 (the size of the array is not known in advance, determine it yourself based on the data in the file).
 
 **w45)** Read the text in English and display statistics on
 frequency of use of letters in the text (i.e. letter - number of uses),
 the letters used most often should be displayed first.
 
 **w46)** Write a method to create an ASCII art file,
 that is, figures of 40x40 characters filled with symbols forming a pattern.
 
 
 
> — Where should I go from here?
— Where do you want to go?
— And I do not care, just to get somewhere.
— Then it doesn't matter where to go. You will definitely get somewhere.
Lewis Carroll - Alice in Wonderland