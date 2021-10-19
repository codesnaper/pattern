## Decorator

## Concept

It is similar to composite. But at each level it add the new functionality without affecting the other.<br>
Also known as wrapper. it also follow (SRP) single responsibilty principle and that SRP must be encapsulated by class <br>
Compose behavior dynamicallty.<br>
It will feel like creational pattern as we are adding instance in constructor but here we are only adding funcitonality in constructor through composition. SO we are changing the structural so it is structoral design pattern.<br>
```new GralicNaanRotiDecorato(new ButterNaanRotiDecorator(new Naan()))```

## Java API
Example : 
- IOStream
```java
File file = new File("./output.txt");
file.createNewFile(); //Add Functionality of file
OutputStream ostream = new FileOutputStrem(file); 
//it is basic decorator which add functionality of output stream to the file
DataOutputStream dout = new DataOutputStream(ostream); 
// As file outputstream don;t have the functionality on how to write the data we use data output stream .Add functionality of Data output stream
dout.write("abc");
//this three are chained together to decorate the functionality from one stream to next and appending the functionality on.
```

- java.util.CheckedList
- UI component


##Design
- Inheritance Based
- Alternative to subclassing because of SRP
- Utilize composition and inheritance( is-a, has-a)
- Constructor require intance from hierarchy

##Pitfall
- New Class is added to each Functionality
- Often Confused with simple inheritance
- Multiple Little Object