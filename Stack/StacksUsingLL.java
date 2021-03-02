/*
Stacks has mainly two operation on the data it contains
- Push and Pop
- LIFO 
- Tower of Hanoi, Navigation in the browsers and Undo mechanism in the text editors

Stacks implementation using Single Linked List  

- Initialize LL with Head Pointing to the null
    Head ---> null

- Push 2 in stack
    Head ---> 2 ---> null

- Push 4 in stack
    Head ---> 2 ---> null
            Head --> 4
    
    Head --> 4 ---> 2 ---> null

- Pop the first node
    Reference Head to the next node 
        Head   4 ---> 2 ---> null
            -------->
        Head ---> 2 ---> null       Garbage - 4 ---> null


methods to be implemented 
size()
isEmpty()
push()
pop()
peek()

*/


