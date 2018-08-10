// Represent position in 2D
public class Coordinates {

  private final int xCoordinate;
  private final int yCoordinate;

  public Coordinates(final int xCoordinate, final int yCoordinate) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
  }

  @Override
  public String toString() {
    StringBuilder coordinateOutput = new StringBuilder();

    coordinateOutput.append(xCoordinate);
    coordinateOutput.append(" ");
    coordinateOutput.append(yCoordinate);

    return coordinateOutput.toString();
  }

  public Coordinates moveForward(int xStepValue, int yStepValue) {
    return new Coordinates(xCoordinate + xStepValue, yCoordinate + yStepValue);
  }
}