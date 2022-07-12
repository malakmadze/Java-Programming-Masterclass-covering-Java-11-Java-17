package challenges.vehicle;

public class Car extends Vehicle{

  private String carBrand;
  private String carModel;
  private int currentGear;
  public Car (int door, int gearBox, int wheels, double engine, String color, String type, String carBrand, String carModel){
    super(door,gearBox,wheels,engine,color,type);
    this.carBrand = carBrand;
    this.carModel = carModel;
    this.currentGear = 1;
  }

  public void setCarBrand (String carBrand){
    this.carBrand = carBrand;
  }
  public void setCarModel (String carModel){
    this.carModel = carModel;
  }
  public void changeGear(int currentGear) {
    this.currentGear = currentGear;
    System.out.println("Part_1.Car.setCurrentGear(): Changed to " + this.currentGear + " Gear");
  }

  public String getCarBrand (){
    return carBrand;
  }
  public String getCarModel(){
    return carModel;
  }
  public int getCurrentGear() {
    return currentGear;
  }

  public void changeVelocity(int speed, int direction){
    super.move(speed, direction);
    System.out.println("Part_1.Car.changevelocity() : Velocity " + speed + " direction " + direction);
  }

}
