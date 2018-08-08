//Understands the Navigation facing
public enum Direction {

  N {
    public Direction right() {
      return E;
    }
  },
  S {
    public Direction right() {
      return W;
    }
  },
  E {
    public Direction right() {
      return S;
    }
  },
  W {
    public Direction right() {
      return N;
    }
  };

  public abstract Direction right();
}
