fun logError(message: String) {
    // We could later extend this function to log to an external file or system
    println("Error: $message")
}

fun main() {
    try {
        val number = 10 / 0 // This will cause an ArithmeticException
    } catch (e: ArithmeticException) {
        logError(e.message ?: "Unknown error occurred")
    }
}
