// Represents the squad of robot rovers on the mars
public class MarsRover {

  private int xBoundaryCoordinate;
  private int yCBoundaryCoordinate;

  private int xCoordinate;
  private int yCoordinate;

  private String direction;

  public MarsRover(final int xBoundaryCoordinate, final int yCBoundaryCoordinate) {
    this.xBoundaryCoordinate = xBoundaryCoordinate;
    this.yCBoundaryCoordinate = yCBoundaryCoordinate;
  }

  public void deployRobotAt(final int xCoordinate, final int yCoordinate, String direction) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
    this.direction = direction;
  }

  public String location() {

    return xCoordinate + " " + yCoordinate + " " + direction;
  }
}
