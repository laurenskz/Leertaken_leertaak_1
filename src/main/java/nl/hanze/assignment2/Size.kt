package nl.hanze.assignment2

enum class Size(val multiplication: Double){
    SMALL(0.8), MEDIUM(1.0), LARGE(1.5);

    override fun toString() = name.toLowerCase()
}