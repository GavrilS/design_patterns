This pattern allows you to break the creation of complex objects to different steps. Instead of having the client call
constructors with large number of parameters, some of which might not be necessary for the concrete type of object the
client needs, it is better to have a builder objects that know how to build the specific object the client needs. The
different steps are represented as methods in the builder which set the base object step by step and then return the finished
product. Builders can be called from the client code or we can have a director that runs the builder.
Example: House builders -> you can have a regular house, a house with a pool, a house with huge gardens, a house made of stone,
a house made of wood, a house on multiple levels...