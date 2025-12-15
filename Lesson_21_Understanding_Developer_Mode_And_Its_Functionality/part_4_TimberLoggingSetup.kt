// Setup Timber in your Application class
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}

// Usage in your Activity or Fragment
fun logMessage(message: String) {
    Timber.d("Debug Message: $message")
}

fun logError(e: Throwable) {
    Timber.e(e, "Error occurred")
}
