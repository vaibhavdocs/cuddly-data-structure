/*
Queues has mainly two operation on the data it contains
- Enqueue and Dequeue 
- BFS (Breadth First Search) where it visits neighbours of the given node and so on
- Request managements in the Servers

Queues implementation using Single Linked List  

- Initialize LL with Head & tail pointing to the null
    Tail
      |
      null
      |
    Head

- Enqueue 2
    Tail
      |
      2 -->null
      |
    Head

- Enqueue 4 
          Tail
           |
      2--> 4 --> null
      |
    Head

- Dequeue 
    Tail
      |
      4 -->null
      |
    Head


methods to be implemented 
size()
isEmpty()
peek()
poll/dequeue()
offer/enqueue()


*/

// Implement queue with statics arrays 
