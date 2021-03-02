/*
Unlike PQ, we have key-value pair in the Indexed Priority Key and it uses same underlying data structure 
as Priority Queue - Binay Heap which is in turn is an Array 

We maintain 3 arrays here 
value, position_mapping array (gives the position of the node in the binary heap)
and inverse_mapping 

methods
size()
isEmpty()
contains()
peekMinKeyIndex()
pollMinKeyIndex()
peekMinValue()
pollMinValue() - removes the root value
insert(key, value)
valueOf(key)
delete(key)
update(key, value)
decrease(key, value)
increase(key, value)
sink(int i)
swim(int i)
minChild()
swap(node i , node j)
less(node i , node j)

*/