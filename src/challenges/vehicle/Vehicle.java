package challenges.vehicle;
// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
public class Vehicle {
  private int doors;
  private int gearBox;
  private int wheels;
  private double engine;
  private String color;
  private String type;

  private int currentVelocity;
  private int currentDirection;

  public Vehicle(int doors, int gearBox, int wheels, double engine, String color, String type) {
    this.doors = doors;
    this.gearBox = gearBox;
    this.wheels = wheels;
    this.engine = engine;
    this.color = color;
    this.type = type;

    this.currentVelocity = 0;
    this.currentDirection = 0;
  }

  public int getDoors() {
    return doors;
  }

  public int getGearBox() {
    return gearBox;
  }

  public int getWheels() {
    return wheels;
  }

  public double getEngine() {
    return engine;
  }

  public String getColor() {
    return color;
  }

  public String getType() {
    return type;
  }

  public int getCurrentVelocity() {
    return currentVelocity;
  }

  public int getCurrentDirection() {
    return currentDirection;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public void setGearBox(int gearBox) {
    this.gearBox = gearBox;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public void setEngine(double engine) {
    this.engine = engine;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setCurrentVelocity(int currentVelocity) {
    this.currentVelocity = currentVelocity;
  }

  public void setCurrentDirection(int currentDirection) {
    this.currentDirection = currentDirection;
  }

  public void steer(int direction) {
    this.currentDirection += direction;
    System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
  }

  public void move(int velocity, int direction) {
    this.currentVelocity = velocity;
    this.currentDirection = direction;
    System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
  }

  public void stop() {
    this.currentVelocity = 0;
  }
}
