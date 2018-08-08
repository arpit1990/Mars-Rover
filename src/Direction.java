//Understands the Navigation facing
public enum Direction {

  N {
    public Direction right() {
      return E;
    }
    public Direction left() {
      return W;
    }
  },
  S {
    public Direction right() {
      return W;
    }
    public Direction left() {
      return E;
    }
  },
  E {
    public Direction right() {
      return S;
    }
    public Direction left() {
      return N;
    }
  },
  W {
    public Direction right() {
      return N;
    }
    public Direction left() {
      return S;
    }
  };

  public abstract Direction right();
  public abstract Direction left();
}
