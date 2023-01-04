package interfaces.exercises.car;

/*
Write an interface for a car that defines methods for starting and stopping the engine,
 as well as for increasing and decreasing the speed (the last two methods should have a parameter
 representing the offset).
 Then, create a class MyCar that implements this interface
 and use it to start and stop the engine, and to change the speed of the car.
 MyCar should have the following fields:
 - isEngineRunning
 - speed
 */
public interface Car {
  void startEngine();
  void stopEngine();
  void increaseSpeed(double amount);
  void decreaseSpeed(double amount);
}