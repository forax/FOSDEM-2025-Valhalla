import com.github.forax.valhalla.Complex

abstract class AbstractBox {
    constructor() {
        println(toString())
    }
}

class InheritedBox : AbstractBox {
    private val complex : Complex;

    constructor(complex : Complex) {
        this.complex = complex
    }

    override fun toString(): String {
        return "InheritedBox($complex)"
    }
}

fun main() {
    val complex = Complex(3.0, 4.0)
    val box = InheritedBox(complex)
    //println("box state: $box")
}

