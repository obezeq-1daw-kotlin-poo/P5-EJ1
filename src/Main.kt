import kotlin.math.sqrt

abstract class Figura(val color: String) {
    abstract fun area(): Double
    abstract fun perimetro(): Double

    override fun toString(): String {
        return "Color = $color | Area = ${this.area()} | Perimetro = ${this.perimetro()}"
    }
}

class Circulo(val radio: Double, color: String): Figura(color) {
    override fun area(): Double {
        return Math.PI * radio * radio
    }

    override fun perimetro(): Double {
        return 2 * Math.PI * radio
    }
}

class Rectangulo(val base: Double, val altura: Double, color: String) : Figura(color) {
    override fun area(): Double {
        return base * altura
    }

    override fun perimetro(): Double {
        return 2 * (base + altura)
    }
}

class Triangulo(val base: Double, val altura: Double, color: String) : Figura(color) {
    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        val lado = sqrt((base * base) + (altura * altura))
        return base + 2 * lado
    }
}

fun main() {
    val circulo = Circulo(5.0, "rojo")
    println(circulo)
}