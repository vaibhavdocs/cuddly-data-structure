/*
Union find is a data structure which keeps track of elements split into one or more disjoint sets
It supports two operations -
union and find
- Kruskal Algo can be implemented using this data structure which will give us better idea

Find - to find is to get the parent node of the element, start from the elements traverse upwards
        and if we counter an elements has a self loop then it is parent node of the element

Union - Combining multiple parents as selecting one parent node as root to other parent node

methods to be implemented here 

- find(p), finds the root node of the p
- connected(p, q) , returns true if the p and q have same parent 
- componentSize(p), 
- unify(p, q), finds the root node of p and q and merge smaller group into larger group

Note : number of components are sets

*/