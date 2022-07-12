package composition.room;
// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
public class Room {
  private Wall wall1;
  private Wall wall2;
  private Wall wall3;
  private Wall wall4;
  private Ceiling ceiling;
  private Bed bed;
  private Lamp lamp;

  public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
    this.wall1 = wall1;
    this.wall2 = wall2;
    this.wall3 = wall3;
    this.wall4 = wall4;
    this.ceiling = ceiling;
    this.bed = bed;
    this.lamp = lamp;
  }

  public Lamp getLamp (){
    return this.lamp;
  }
  public void makeBed(){
    System.out.println("Bedroom -> Making bed");
    bed.make();
  }
}
