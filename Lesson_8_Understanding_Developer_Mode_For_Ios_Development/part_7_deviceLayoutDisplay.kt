fun displayLayoutForDevice() {
    if (isItTablet()) {
        println("Display Tablet Layout")
    } else {
        println("Display Phone Layout")
    }
}

fun isItTablet(): Boolean {
    // Simulate a check for device type
    return true // Assume this is a tablet for this example
}
