//Understands the Navigation facing
enum Direction {

  N {
    public Direction right() {
      return E;
    }

    public Direction left() {
      return W;
    }

    @Override
    public int xOneStepSize() {
      return 0;
    }

    @Override
    public int yOneStepSize() {
      return 1;
    }
  },
  S {
    public Direction right() {
      return W;
    }

    public Direction left() {
      return E;
    }

    @Override
    public int xOneStepSize() {
      return 0;
    }

    @Override
    public int yOneStepSize() {
      return -1;
    }
  },
  E {
    public Direction right() {
      return S;
    }

    public Direction left() {
      return N;
    }

    @Override
    public int xOneStepSize() {
      return 1;
    }

    @Override
    public int yOneStepSize() {
      return 0;
    }
  },
  W {
    public Direction right() {
      return N;
    }

    public Direction left() {
      return S;
    }

    @Override
    public int xOneStepSize() {
      return -1;
    }

    @Override
    public int yOneStepSize() {
      return 0;
    }
  };

  public abstract Direction right();

  public abstract Direction left();

  public abstract int xOneStepSize();

  public abstract int yOneStepSize();
}
