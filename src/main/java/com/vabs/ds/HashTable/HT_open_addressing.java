/*
In hash table, we have mapping between and index and value just like an array does but here 
we generate the indexes from an function which takes input parameter - value and returns key
such function are called Hash function and process is called Hashing 

Open addressing - 
When values are mapped to same key then we probe the next available location for the key-value pair

- Linear probing
- Quadratic probing
- Double hashing 


methods to be implemented for this 
size() gives the current size
isEmpty() 
normalizeIndex(int keyHash) gives the index 
clear()
containsKey(key) || hasKey(key)
insert(key, value)
get(key) get key's value
remove(key) 
bucketEntryInsert()
bucketEntrySeek()
bucketEntryRemove()
resizeEntry()
keys()
values()


*/