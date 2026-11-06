# Journal
Phase 1 - 
## Phase 1

The queue on its own doesn't know what "smallest" means for a company. It calls compareTo to compare 2 companies, and I made that method compare their size. A negative result means the 1st company goes in front. If I wanted to merge the largest first, I would look at the compareTo line and swap the 2 things in the parentheses. It would then look for the largest first, not the smallest. The swap flips the sign of the result, so a company that used to come out negative(goes in front of the other one ) would now come out positive(goes behind the other one ).