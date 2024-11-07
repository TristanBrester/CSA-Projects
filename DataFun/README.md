# Data Fun - Project 2

The purpose of this assignment is to get some experience working with selection structures (if, else, elif, and switch cases), as well as more experience working with simple data types. You might need to do some
reserach and some of the words are links so you can see the Wikipedia page.

## Overview

This program will allow you to demonstrate your mastery of ifs, elses, elif, and switch cases.   It will consist of two distinct parts: one that deals with integers and one that deals with characters.

The program will use the command line for its input and output (I/O).

## Details
The first part of the program will do the following:
- Get the user’s favorite integer.
- Print out if it’s positive or negative (consider 0 as positive)
- Print out if it’s greater than 10, 100, or 1000 (only print the highest one it’s greater than).
- Print out if it’s odd or even
- If the number is the atomic number of one of the 7 noble gases, it should print out the name of the [noble gas](https://en.wikipedia.org/wiki/Noble_gas) corresponding to that atomic number.  If the number is NOT the atomic number of one of the 7 noble gases, it should print a message stating that.  (use match case for this)

The second part of the program will do the following:
- Get the user’s favorite character.
- Print out if it’s a numeric digit, lowercase letter, or uppercase letter.
- If it’s a letter, prints out if it’s a vowel or not
- Print out the [ASCII](https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html) value of the character
- If it’s a letter, prints out where it is in the alphabet (A=1st, B=2nd, C=3rd, etc., and print the proper suffix (st, nd, rd, th, etc.)
  - Hint: Look for a pattern in the ASCII table 

## Sample Output

Output should be well formatted and look similar to this:

*What is your favorite integer? 42*

&nbsp;&nbsp;&nbsp;&nbsp; *42 is a positive number,*

&nbsp;&nbsp;&nbsp;&nbsp; *it is greater than 10,*

&nbsp;&nbsp;&nbsp;&nbsp; *it is even,*

&nbsp;&nbsp;&nbsp;&nbsp; *and it is not the atomic number of a noble gas.*


*What is your favorite character? E*

&nbsp;&nbsp;&nbsp;&nbsp;*E is an uppercase letter,*

&nbsp;&nbsp;&nbsp;&nbsp; *it is a vowel,*

&nbsp;&nbsp;&nbsp;&nbsp; *its ASCII value is 69,* 

&nbsp;&nbsp;&nbsp;&nbsp; *and it is the 5th letter of the alphabet.*


## Technical Details
- Name your program DataFun.java
- Include a block at the top of your code that has your name, date, and description of the what the program does.
- You must use ifs, elses, and at least one switch case
  
As with all programs written in this course, maintainability is as important as functionality, so your code should be clear and easy to follow.

- Google's Java Style Guide: [https://google.github.io/styleguide/javaguide.html](https://google.github.io/styleguide/javaguide.html)
- Speficially Sections 2.1, 3.3, 4, and 5

## Submitting

Upload your .java file into Google Classroom along with your pseudocode
