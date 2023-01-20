# Instructions

In this assignment you are asked to design a simple class to model a die, according to the following specifications. A die is defined by a number of sides (at least 2) and a value that keeps the die’s current value (set to 1 upon initialization). Users should be able to create a die given its number of sides. If the informed number of sides is less than 2, set it to 2. Users should also be able to create a die without informing its number of sides (in that case, set the number of sides to 6). Remember, the current value of a die should always be set to 1 upon creation. Create a method called “getValue” that returns the die's current value. Also, define a method called “roll” to randomly pick another value for the die, based of course on the number of sides. 

Illustrate how the Die class can be used by creating a DieDriver program. This program should create an 8-sides die. After showing the information about the die, the program should roll it 10 times, displaying its current value at each iteration. Below is an example output for your reference. 

```
Die{sides=8, value=1}
4
7
8
8
6
7
1
1
6
4
```

# Submission

Zip Die.java and DieDriver.java in a file called die.zip. You must use the zip format! Inside the zip file there should be only the 2 java files and nothing else. 

# Rubric

+1 Die's member variables

+1 Die's constructors

+1 Die's methods

+2 DieDriver's implementation

-1 zip file not submitted according to the format that was asked

-1 source files didn't identify the student's name in the comments section

-1 Die class implementation didn't use the provided class variables when appropriate

Total: 5 points