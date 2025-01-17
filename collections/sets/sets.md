You need to use Set data structure when you do not
want to allow duplicate entries. For example, you need
to buy different ingredients to bake some cookies.
You need to track the ingredients you have purchased and
you need to avoid buying duplicate items, but also ensure you
get all required ingredients. As you purchase an ingredient, 
you remove it from the set. If someone suggests buying the
ingredient you've already purchased, you do not
add it again, because sets do not allow duplicates.
![img.png](set-example.png)
Popular Set implementations are: HashSet and TreeSet.
HashSet stores the elements in a hash table, so that
the keys are a hash and the values are the Objects. It
uses the hashCode() method of the objects to retrieve them
more efficiently.
In terms of time complexity, main advantage of HashSet is
that adding an element or checking if the element exists
inside the set both have constant times O(1). This is
because of Hashtable usage. Once the has is calculated,
the corresponding value will be retrieved in constant time,
without any iterations or lookups.

Another popular Set implementation is TreeSet. It stores 
its elements in a sorted tree structure. Its main benefit
is that the set is always in a sorted order. Downside
is that adding and checking if the element already exists
takes longer than for the HashSet, especially when the tree
becomes bigger. We can represent TreeSet like in the picture
below:
