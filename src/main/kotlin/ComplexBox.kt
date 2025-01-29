import com.github.forax.valhalla.Complex

class ComplexBox {
    private val complex : Complex

    constructor(complex : Complex) {
        println("this: $this")
        this.complex = complex
    }

    override fun toString(): String {
        return "ComplexBox($complex)"
    }
}

fun main() {
    val complex = Complex(3.0, 4.0)
    val box = ComplexBox(complex)
    //println("box state: $box")
}
