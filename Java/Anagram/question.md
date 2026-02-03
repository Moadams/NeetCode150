# Anagram Problem
Given two string *s* and *t*, return true if *t* is an anagram of *s*, and *false* otherwise.

## Suggested solution
We can introduce an array with the size as the length of *s* and put in the values of *s*, then remove them if the value is found in *t*

## Optimal Solution
We first check if the length of both strings are the same, if not we return false, then we create an array of size 26 with the value at each index set to 0 (that is the size of english alphabets), and then loop through the size of the string we increase the value at the character index by 1 for the string *s* and decrease the value at the character index for string *t*. After we are done, we check if there are non zero values in the array created. If there are, we return false, else true.