package challenges.vehicle;

public class Truck extends Car {

  private int palletCapacity;

  private Truck( String carBrand, String carModel, int palletCapacity) {
    super(2, 9, 20, 5.0, "White", "Truck", carBrand, carModel);
    this.palletCapacity = palletCapacity;
  }
  public void setPalletCapacity (int palletCapacity){
    this.palletCapacity = palletCapacity;
  }
  public int getPalletCapacity () {
    return palletCapacity;
  }

}