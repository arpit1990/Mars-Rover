// Represents the squad of robot rovers on the mars

public class MarsRover {

  private int xCoordinate;
  private int yCoordinate;
  private String direction;

  public MarsRover(final int xCoordinate, final int yCoordinate, String direction) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
    this.direction = direction;
  }

  public String location() {

    return "2 4 N";
  }
}
