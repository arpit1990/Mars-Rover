import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

  private MarsRover marsRover;

  @BeforeEach
  void setUp() {
    marsRover = new MarsRover(5, 5);
  }

  @AfterEach
  void tearDown() {
    marsRover = null;
  }

  @Test
  public void expectZeroZeroNorthWhenDeployedAtOriginWithNorthFace() {
    marsRover.deployRobotAt(0,0,"N");

    assertEquals("0 0 N", marsRover.location());
  }

  @Test
  public void expectOneFourNorthWhenDeployedAtOneAndFourWithNorthFace() {
    marsRover.deployRobotAt(1,4,"N");

    assertEquals("1 4 N", marsRover.location());
  }

  @Test
  public void expectSameCoordinateWithNorthWhenTurnRightFromWEST() {
    marsRover.deployRobotAt(2,3,"W");
    marsRover.right();

    assertEquals("2 3 N", marsRover.location());
  }

  @Test
  public void expectSameCoordinateWithNorthWhenTurnLeftFromEast() {
    marsRover.deployRobotAt(2,3,"E");
    marsRover.left();

    assertEquals("2 3 N", marsRover.location());
  }

  @Test
  public void expectsOneThreeNorthWhenMoveForwardFromOneTwoWithNorthFacing() {
    marsRover.deployRobotAt(1,3,"N");
    marsRover.move();

    assertEquals("1 4 N", marsRover.location());
  }
}