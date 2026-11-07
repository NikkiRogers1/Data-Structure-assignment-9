# Journal
Phase 1 - 
## Phase 1

The queue on its own doesn't know what "smallest" means for a company. It calls compareTo to compare 2 companies, and I made that method compare their size. A negative result means the 1st company goes in front. If I wanted to merge the largest first, I would look at the compareTo line and swap the 2 things in the parentheses. It would then look for the largest first, not the smallest. The swap flips the sign of the result, so a company that used to come out negative(goes in front of the other one ) would now come out positive(goes behind the other one ).


Phase 2- 
## Phase 2

The priority queue is more efficient for this process than an ArrayList because of what happens each time through my loop. At the end of every pass, one new merged company goes back in. With an ArrayList, I would have to stop and re-sort the whole list every time before I could pick the two smallest companies. With the priority queue, I don't have to stop and sort, because it only has to figure out where that one new company belongs. Adding one item to a priority queue takes O(log n) time, and sorting a whole list takes O(n log n) time. Re-sorting the whole list is more work, so it would take longer. The more companies there are, the bigger that difference gets.

Phase 3- 
## Phase 3

If I forgot to check the queue size before calling poll() twice, my code could try to take a company out of an empty queue. With one company left, the first poll takes it out and the queue is empty. The second poll returns null because there is nothing to take. Then calling getSize() on it makes the program crash. This relates to underflow, which is trying to remove something from a data structure that is already empty. If I forgot the size check, I wouldn't know the queue was empty, so my code would try to remove from it anyway.