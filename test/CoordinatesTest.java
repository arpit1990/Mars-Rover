import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

  private Coordinates coordinates;

  @BeforeEach
  void setUp() {
    coordinates = new Coordinates(2, 4);
  }

  @AfterEach
  void tearDown() {
    coordinates = null;
  }

  @Test
  public void expectsOneStepForwardOnXWithGivenCoordinates() {
    Coordinates afterMove = coordinates.moveForward(1,0);

    assertEquals("3 4", afterMove.toString());
  }
}