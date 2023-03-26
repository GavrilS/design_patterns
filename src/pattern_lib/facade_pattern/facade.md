Simply put, a facade encapsulates a complex subsystem behind a simple interface. It hides much of the complexity and
makes the subsystem easy to use.
Also, if we need to use the complex subsystem directly, we still can do that; we aren't forced to use the facade all
the time.
Besides a much simpler interface, there's one more benefit of using this design pattern. It decouples a client
implementation from the complex subsystem. Thanks to this, we can make changes to the existing subsystem and don't
affect a client.

Example:
Let's look at a car start and stop operations:
- We have a bunch of different classes each of which takes care of a certain operation that plays a role in starting
the car:
    airFlowController.takeAir()
    fuelInjector.on()
    fuelInjector.inject()
    starter.start()
    coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP)
    coolingController.run()
    catalyticConverter.on()

- We have another bunch of classes and methods to stop the car:
    fuelInjector.off()
    catalyticConverter.off()
    coolingController.cool(MAX_ALLOWED_TEMP)
    coolingController.stop()
    airFlowController.off()

Instead of calling each of these when we want to start and stop the car, the facade pattern can give us an interface to
simplify this process, while still allowing us to do it the old way if there is a special case where we cannot/do not want
to use the facade interface. Now, to start and stop a car, we need only 2 lines of code, instead of 13:
    facade.startEngine();
    // ...
    facade.stopEngine();

# Drawbacks:
The facade pattern doesn't force us to unwanted tradeoffs, because it only adds additional layers of abstraction.
Sometimes the pattern can be overused in simple scenarios, which will lead to redundant implementations.