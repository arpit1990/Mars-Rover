import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

  @Test
  public void expectZeroZeroNorthWhenDeployedAtOriginWithNorthFace() {
    MarsRover marsRover = new MarsRover(5, 5);
    marsRover.deployRobotAt(0,0,"N");

    assertEquals("0 0 N", marsRover.location());
  }

  @Test
  public void expectOneFourNorthWhenDeployedAtOneAndFourWithNorthFace() {
    MarsRover marsRover = new MarsRover(5, 5);
    marsRover.deployRobotAt(1,4,"N");

    assertEquals("1 4 N", marsRover.location());
  }

  @Test
  public void expectSameCoordinateWithNorthWhenTurnRightFromWEST() {
    MarsRover marsRover = new MarsRover(5, 5);
    marsRover.deployRobotAt(2,3,"W");
    marsRover.right();

    assertEquals("2 3 N", marsRover.location());
  }

  @Test
  public void expectSameCoordinateWithNorthWhenTurnLeftFromEast() {
    MarsRover marsRover = new MarsRover(5, 5);
    marsRover.deployRobotAt(2,3,"E");
    marsRover.left();

    assertEquals("2 3 N", marsRover.location());
  }

  @Test
  public void expectsOneThreeNorthWhenMoveForwardFromOneTwoWithNorthFacing() {
    MarsRover marsRover = new MarsRover(5, 5);
    marsRover.deployRobotAt(1,3,"N");
    marsRover.move();

    assertEquals("1 4 N", marsRover.location());
  }

  @Test
  public void expectsOneThreeNorthWhenNavigationLMLMLMLMM() {
    MarsRover marsRover = new MarsRover(5, 5);
    marsRover.deployRobotAt(1,2,"N");
    marsRover.executeNavigationCommand("LMLMLMLMM");

    assertEquals("1 3 N", marsRover.location());
  }
}