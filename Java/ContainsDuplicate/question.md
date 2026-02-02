## Contains Duplication :- Leetcode 217
---

Given an integer array *nums* return *true* if any value appears at least twice in the array and return *false* if every element is distinct.


### Suggested Approach (Brute Force)
Take each number and loop through to find its duplicate. If a duplicate is found return true else continue till we reach the end of the list

With this approach, we will have a time complexity of O(n^2^), which is not ideal

### Optimised solution 
We can do this by introducing a hash set to keep track of the items we visit.
So we loop through the list and for every item we come across, we put that item in the hashset, if we come across another value that is already in the hashset, we return true, if not we keep on till we reach the end of the list and return false.

With this, the time complexity will be O(n) and a space complexity of O(n) 

