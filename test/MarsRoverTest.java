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
  public void expectZeroZeroNorthCurrentLocationWhenDeployedAtOriginWithNorthFace() {
    marsRover.deployRobotAt(0,0,"N");

    assertEquals("0 0 N", marsRover.location());
  }

  @Test
  public void expectOneFourNorthCurrentLocationWhenDeployedAtOneAndFourWithNorthFace() {
    marsRover.deployRobotAt(1,4,"N");

    assertEquals("1 4 N", marsRover.location());
  }
}