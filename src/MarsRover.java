// Represents the squad of robot rovers on the mars
public class MarsRover {

  private static final int STEP_FORWARD = 1;

  private int topRightXCoordinate;
  private int topRightYCoordinate;

  private Coordinates coordinates;

  private Direction direction;

  //xBoundaary = topRightXCoordinate
  //yBoundary = topRightYCoordinate
  public MarsRover(final int topRightXCoordinate, final int topRightYCoordinate) {
    this.topRightXCoordinate = topRightXCoordinate;
    this.topRightYCoordinate = topRightYCoordinate;
  }

  public void deployRobotAt(final int xCoordinate, final int yCoordinate, String directionString) {
    Direction direction = Direction.valueOf(directionString);

    coordinates = new Coordinates(xCoordinate, yCoordinate);
    this.direction = direction;
  }

  public void right() {
    direction = direction.right();
  }

  public String location() {

    return coordinates.toString() + " " + direction;
  }

  /*public void move() {
    Coordinates afterMove = coordinates.moveForward();
  }*/
}