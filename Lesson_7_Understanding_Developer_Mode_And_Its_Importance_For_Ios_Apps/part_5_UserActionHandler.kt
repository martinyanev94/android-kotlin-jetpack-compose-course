class UserAction {
    fun executeAction() {
        try {
            // Potentially error-causing operation
            throw Exception("Sample error")
        } catch (e: Exception) {
            println("Caught an error: ${e.message}") // Log the error message
        }
    }
}
