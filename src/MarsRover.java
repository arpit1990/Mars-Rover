// Represents the squad of robot rovers on the mars
public class MarsRover {

  private int xBoundaryCoordinate;
  private int yCBoundaryCoordinate;

  private Coordinates coordinates;

  private String direction;

  public MarsRover(final int xBoundaryCoordinate, final int yCBoundaryCoordinate) {
    this.xBoundaryCoordinate = xBoundaryCoordinate;
    this.yCBoundaryCoordinate = yCBoundaryCoordinate;
  }

  public void deployRobotAt(final int xCoordinate, final int yCoordinate, String direction) {
    coordinates = new Coordinates(xCoordinate, yCoordinate);
    this.direction = direction;
  }

  public void turnLeft() {

  }

  public String location() {

    return coordinates.toString() + " " + direction;
  }
}