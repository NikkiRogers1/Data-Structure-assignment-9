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

Phase 4- 
I predicted in test one if I started with companies that are already very large then the program would reach the titan limit quicker and not as many companies would merge. It wouldnt reach the one company left in queue requirement. And for the second test then the companies would all merge into one company but would not be considered a titan. The size wouldnt reach the 500000 limit. I noticed in my first test I started two companies with sizes over 500,000. The output showed the largest merged company as the titan even though two original companies were significantly larger than the merged company that was because in the if statement inside the while loop that calcualtes the titan it only finds and prints the merged company. For the second test my prediction was correct all the companies merged into one and no titan company was named. The loop stopped because only one company remained and there were no more in the queue. the merger count was 7 and not 8 because it takes two companies and gives back one.I asked Claude to review my code for edge cases and ways to make the output more professional. It suggested three things:
1. If I commented out all the companies and left an empty queue, the Phase 1 check at the top would break. The poll would give back null, and then adding that null back into the queue would crash the program. A size check before that part would protect it.
2. When I started with some companies already at titan size, my code only named the merged company as the titan, not the original company that was already a titan. This is the same problem I found in my own testing.
3. The printed name of a merged company gets really long, and it could be shorter to make it easier for users to read.