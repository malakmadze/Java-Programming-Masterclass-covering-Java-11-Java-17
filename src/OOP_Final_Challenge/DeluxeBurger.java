package OOP_Final_Challenge;

public class DeluxeBurger extends Hamburger{
  public DeluxeBurger() {
    super("Deluxe", "Sausage & Bacon", 14.54, "White" );
    super.addHamburgerAddition1("Chips", 2.75 );
    super.addHamburgerAddition2("Drink", 1.81 );
  }

  @Override
  public void addHamburgerAddition1(String addition1Name, double addition1price) {
    System.out.println("Can not add additional items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition2(String addition2Name, double addition2price) {
    System.out.println("Can not add additional items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition3(String addition3Name, double addition3price) {
    System.out.println("Can not add additional items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition4(String addition4Name, double addition4price) {
    System.out.println("Can not add additional items to a deluxe burger");
  }
}
