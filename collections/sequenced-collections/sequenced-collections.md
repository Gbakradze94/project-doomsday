# Sequenced Collections
From JDK 21, three interfaces were introduced to represent collections
with a defined encounter order: SequencedCollection, SequencedSet, and
SequencedMap. These interfaces provide uniform APIs for accessing their first element,
second element, and so forth, up to the last element, and processing the elements in
forward or reverse order.

Prior to JDK 21, there was no collection type, which would represent  a sequence of
elements with a defined encounter order. For example, List and Deque interfaces 
defined an encounter order, but their common supertype Collection did not. In order
to get the first element of Deque, you had to use the getFirst() method, while
for List, you had to use get(0). This made it difficult to write such kind of 
code that could work with any collection type that had a defined encounter order.

The similar case was with Set interface. The Set and HashSet did not define an
encounter order, while LinkedHashSet and SortedSet did.
Given the lack of a collection type with a defined encounter order, there was no uniform set
of operations to respect encounter order. While there were operations that respect encounter
order, they were not uniform.

### Solution
JDK 21 introduced three new interfaced to represent collections with a 
defined encounter order: