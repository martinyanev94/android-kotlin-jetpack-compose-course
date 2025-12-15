class AnalyticsService {
    fun trackEvent(eventName: String) {
        // Simulate sending event to an analytics server
        Log.d("Analytics", "Event tracked: $eventName")
    }
}

fun onShareButtonClick() {
    AnalyticsService().trackEvent("Share Button Clicked")
}
