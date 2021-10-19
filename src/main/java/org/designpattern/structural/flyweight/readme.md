# Flyweight Pattern
Flyweight pattern  reduce memories by sharing data with similar kind of object

## Concept
- More efficient use of memory . Also known as optimization pattern.
- Large Number of smaller object
- Object can be immutable / stateless
- Most of the state can be extrinsic(not essential/ not inherit)

##JAva API example:
- java.util.String
- java.land.Integer#valueOf(int)
- Boolean, Byte, Character, Short, Long.

## Design
- Use factory pattern
- Encompasses Creation and Structure. It has creation pattern inside the structure pattern.
- Classes: Client, Factory, Flyweight, Concrete Flyweight.

## Example
```java
Integer firstInt = Integer.valueOf(5);
Integer secondInt = Integer.valueOf(5);
Integer thirdInt = Integer.valueOf(10);
System.identityHashCode(firstInt) == System.identityHashCode(secondInt) ;
//They both is same object. It use flyweight pattern . It goes inside cache pool and return obj
System.identityHashCode(secondInt) != System.identityHashCode(thirdInt) ;
```

## Pitfall
- Complex pattern
- Premature Optimization. (Before starting if we know the product and business scenario then it will be good)
- Must understand factory pattern
- Not graphical pattern
