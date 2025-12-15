import android.location.Location

fun getCurrentLocation(): Location {
    val location = Location("dummyprovider")
    location.latitude = 37.3349 // Apple's HQ latitude
    location.longitude = -122.0090 // Apple's HQ longitude
    return location
}
