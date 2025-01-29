import com.github.forax.valhalla.Complex;

static /*value*/ class JavaBox {
  private final Complex/*!*/ complex;

  public JavaBox(Complex complex) {
    println("this: " + this);
    this.complex = complex;
    //super();
  }

  @Override
  public String toString() {
    return "JavaBox(" + complex + ")";
  }
}

void main() {
  var complex = new Complex(3.0, 4.0);
  var box = new JavaBox(complex);
  //println("box state :" + box);
}

