import kotlin.math.sqrt

class Triangulo(private val base: Double, private val altura: Double, color: String) : Figura(color) {
    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        val lado = sqrt((base * base) + (altura * altura))
        return base + 2 * lado
    }
}
