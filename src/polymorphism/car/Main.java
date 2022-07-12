package polymorphism.car;
/*
	    // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).
 */
class Car {
  private boolean engine;
  private int cylinders;
  private int wheels;
  private String name;

  public Car(int cylinders, String name) {
    this.wheels = 4;
    this.engine = true;
    this.cylinders = cylinders;
    this.name = name;
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }

  public String startEngine() {
    return "Car's engine is starting";
  }

  public String accelerate() {
    return "Car is accelerating";
  }

  public String brake() {
    return "Car is braking";
  }
}

//**************************************************
//**************************************************
class Mitsubishi extends Car {
  public Mitsubishi(int cylinders, String name) {
    super(cylinders, name);
  }

  public String startEngine() {
    return "Mitsubishi's engine is starting";
  }

  public String accelerate() {
    return "Mitsubishi's is accelerating";
  }

  public String brake() {
    return "Mitsubishi's is braking";
  }
}

//**************************************************
//**************************************************
class Ford extends Car {
  public Ford(int cylinders, String name) {
    super(cylinders, name);
  }

  public String startEngine() {
    return "Ford's engine is starting";
  }

  public String accelerate() {
    return "Ford's is accelerating";
  }

  public String brake() {
    return "Ford's is braking";
  }
}

//**************************************************
//**************************************************
class Holden extends Car {
  public Holden(int cylinders, String name) {
    super(cylinders, name);
  }

  public String startEngine() {
    return (getClass().getSimpleName() + " engine is starting");
  }

  public String accelerate() {
    return ("Holden's is accelerating");
  }

  public String brake() {
    return ("Holden's is braking");
  }
}


//**************************************************
//**************************************************


public class Main {
  public static void main(String[] args) {
    Car car = new Car(8, "Base Car");
    car.startEngine();
    car.accelerate();
    car.brake();

    Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
    mitsubishi.startEngine();
    mitsubishi.accelerate();
    mitsubishi.brake();

    Ford ford = new Ford(6, "Mustang");
    ford.startEngine();
    ford.accelerate();
    ford.brake();


    Holden holden = new Holden(6,"Model");
    holden.startEngine();
    holden.accelerate();
    holden.brake();
  }
}
