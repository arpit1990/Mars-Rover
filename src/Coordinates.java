public class Coordinates {

  private int xCoordinate;
  private int yCoordinate;

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
}