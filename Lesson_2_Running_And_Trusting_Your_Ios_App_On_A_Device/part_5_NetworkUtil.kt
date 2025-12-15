import android.net.ConnectivityManager

fun isNetworkAvailable(connectivityManager: ConnectivityManager): Boolean {
    val networkInfo = connectivityManager.activeNetworkInfo
    return networkInfo != null && networkInfo.isConnected
}
