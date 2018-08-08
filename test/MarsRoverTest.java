import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

  private MarsRover marsRover;

  @BeforeEach
  void setUp() {
    marsRover = new MarsRover(2, 4, "N");
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  public void expect() {
    assertEquals("2 4 N", marsRover.location());
  }
}