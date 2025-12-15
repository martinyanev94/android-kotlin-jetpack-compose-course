fun fetchData() {
    if (isNetworkAvailable()) {
        // Perform API call
    } else {
        showRetryDialog()
    }
}

fun isNetworkAvailable(): Boolean {
    val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetworkInfo = connectivityManager.activeNetworkInfo
    return activeNetworkInfo?.isConnected == true
}
