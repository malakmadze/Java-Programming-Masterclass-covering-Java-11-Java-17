package OOP_Final_Challenge;

public class Hamburger {
  private String breadRollType;
  private String meat;
  private String name;
  private double price;

  private String addition1Name;
  private double addition1Price;
  private String addition2Name;
  private double addition2Price;
  private String addition3Name;
  private double addition3Price;
  private String addition4Name;
  private double addition4Price;

  public Hamburger(String name, String meat,  double price, String breadRollType) {
    this.breadRollType = breadRollType;
    this.meat = meat;
    this.name = name;
    this.price = price;
  }

  public void addHamburgerAddition1 (String addition1Name, double addition1Price){
    this.addition1Name = addition1Name;
    this.addition1Price = addition1Price;
  }

  public void addHamburgerAddition2 (String addition2Name, double addition2Price){
    this.addition2Name = addition2Name;
    this.addition2Price = addition2Price;
  }
  public void addHamburgerAddition3 (String addition3Name, double addition3Price){
    this.addition3Name = addition3Name;
    this.addition3Price = addition3Price;
  }
  public void addHamburgerAddition4 (String addition4Name, double addition4Price){
    this.addition4Name = addition4Name;
    this.addition4Price = addition4Price;
  }

  public double itemizeHamburger (){
    double hamburgerPrice = this.price;
    System.out.println(this.name + " hamburger" + " on a " + this.breadRollType + " roll " + "with " + this.meat + ", price is " + this.price );
    if (addition1Name != null ){
      hamburgerPrice += this.addition1Price;
      System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
    }
    if (addition2Name != null ){
      hamburgerPrice += this.addition2Price;
      System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
    }
    if (addition3Name != null ){
      hamburgerPrice += this.addition3Price;
      System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
    }
    if (addition4Name != null ){
      hamburgerPrice += this.addition4Price;
      System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
    }
    return hamburgerPrice;
  }
}
