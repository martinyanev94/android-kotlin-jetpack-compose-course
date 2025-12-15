private fun calculateValue(input: Int?): Int {
    return input ?: throw IllegalArgumentException("Input must not be null")
}
