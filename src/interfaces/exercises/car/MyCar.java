package interfaces.exercises.car;

public class MyCar implements Car {
  private boolean isEngineRunning;
  private double speed;

  public MyCar() {
    this.isEngineRunning = false;
    this.speed = 0;
  }

  @Override
  public void startEngine() {
    if (!isEngineRunning) {
      isEngineRunning = true;
      System.out.println("Engine started");
    } else {
      System.out.println("Engine is already running");
    }
  }

  @Override
  public void stopEngine() {
    if (isEngineRunning) {
      isEngineRunning = false;
      System.out.println("Engine stopped");
    } else {
      System.out.println("Engine is already stopped");
    }
  }

  @Override
  public void increaseSpeed(double amount) {
    if (isEngineRunning) {
      speed += amount;
      System.out.println("Increased speed by " + amount + " mph");
    } else {
      System.out.println("Cannot increase speed. Engine is not running");
    }
  }

  @Override
  public void decreaseSpeed(double amount) {
    if (isEngineRunning) {
      speed -= amount;
      if (speed < 0) {
        speed = 0;
      }
      System.out.println("Decreased speed by " + amount + " mph");
    } else {
      System.out.println("Cannot decrease speed. Engine is not running");
    }
  }
}