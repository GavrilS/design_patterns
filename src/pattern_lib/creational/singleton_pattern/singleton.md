Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational
pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object
gets created. This class provides a way to access its only object which can be accessed directly without need to
instantiate the object of the class.

We're going to create a SingleObject class. SingleObject class have its constructor as private and have a static
instance of itself.

SingleObject class provides a static method to get its static instance to outside world.

# Lazy instantiation:
We create the instance of the class in synchronized method or synchronized block, so instance of the class is created
when required.