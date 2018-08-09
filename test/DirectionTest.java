import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

  @Test
  public void expectsNorthWhenTurnRightFacingWest() {
    assertEquals(Direction.N, Direction.W.right());
  }

  @Test
  public void expectsNorthWhenTurnLeftFacingEast() {
    assertEquals(Direction.N, Direction.E.left());
  }

  @Test
  public void expectsOneOnYWhenMoveToNorth() {
    assertEquals(1, Direction.N.yStepSize());
  }

  @Test
  public void expectsMinusOneOnXWhenMoveToWest() {
    assertEquals(-1, Direction.W.xStepSize());
  }
}