import javax.xml.bind.ValidationException;

// Represents the squad of robot rovers on the mars
public class MarsRover {

  private static final int STEP_FORWARD = 1;

  private int topRightXCoordinate;
  private int topRightYCoordinate;

  private Coordinates coordinates;

  private Direction direction;

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

  public void left() {
    direction = direction.left();
  }

  public String location() {
    return coordinates.toString() + " " + direction;
  }

  public void move() {
    // get the direction and increment coordinates accordingly
    Coordinates afterMove = coordinates.moveForward(direction.xOneStepSize(), direction.yOneStepSize());

    coordinates = afterMove;
  }

  public void executeNavigationCommand(String navigationCommand) {
    deployRobotAt(1,2,"N");

    String[] navigationCommands = navigationCommand.split("");
    for(String navigation : navigationCommands) {
      switch(navigation) {
        case "L":
          left();
          break;
        case "R":
          right();
          break;
        case "M":
          move();
          break;
          default:
            System.out.println("Invalid command");
            return;
      }
    }
  }
}