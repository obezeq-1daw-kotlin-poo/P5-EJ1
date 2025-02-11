abstract class Figura(private val color: String) {

    abstract fun area(): Double
    abstract fun perimetro(): Double

    override fun toString(): String {
        return "Color = $color | Area = ${this.area()} | Perimetro = ${this.perimetro()}"
    }

}