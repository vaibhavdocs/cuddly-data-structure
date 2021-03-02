/*
Single linked list has reference to next node.
Head and Initial Tails are known at the start

1 ---> 2 ---> 3 ----> 5 ----> null

1. Adding a node to Single Linked List
    
    Let's say we add 4 at fourth position 

        Step 1: 1 ---> 2 ---> 3 ---> 5 ----> null
                            4
                            
        Step 2: 1 ---> 2 ---> 3 ---> 5 ----> null
                            4 --->

        Step 3: 1 ---> 2 ---> 3           5 ----> null
                                ---> 4 --->

        1 ---> 2 ---> 3 ---> 4 ---> 5 ----> null

2. Removing a node from a Single Linked List
    Let's say we take out 4 
    1 ---> 2 ---> 3 ---> 4 ---> 5 ----> null

        Step 1: 1 ---> 2 ---> 3 ---> 4 ---> 5 ----> null
                            ^             ^
                            |             |
                            |             |
                            trav1         trav2

        Step 2: 1 ---> 2 ---> 3     4 ---> 5 ----> null
                            ^ ---------> ^
                            |            |
                            |            |
                            trav1        trav2

        Step 3: 1 ---> 2 ---> 3 ---> 5 ----> null and take care of the recently removed node if you are managing the memory
                      
*/


// methods to be implemented in our custom linked list class
/*
size()
isEmpty()
add()
addLast()
addFirst()
peekFirst()
peekLast()
removeFirst()
removeLast()
remove()
removeAt()
remove()
indexOf()
contains()
toString()
*/