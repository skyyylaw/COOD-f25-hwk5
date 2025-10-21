import java.awt.*;
import java.util.Objects;

public class ShapeContainer<T extends Shape> {
  private T shape;

  public ShapeContainer(T shape){
    this.shape = shape;
  }

  public T getShape(){
    return shape;
  }

  @Override
  public boolean equals(Object o){
    // same object
    if (this == o) {
      return true;
    }
    // type check
    if (! (o instanceof ShapeContainer<?>)) {
      return false;
    }
    // instance check
    ShapeContainer<?> other = (ShapeContainer<?>) o;
    // this checks equals + safeguard agains this.shap == null scenario
    return Objects.equals(shape, other.getShape());
  }

  @Override
  public int hashCode() {
    if (shape != null) {
      return shape.hashCode();
    }
    return 0;
  }
}
