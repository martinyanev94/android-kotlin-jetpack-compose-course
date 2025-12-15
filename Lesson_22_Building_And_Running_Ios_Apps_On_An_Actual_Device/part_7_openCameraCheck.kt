fun openCamera() {
    if (packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
        // Proceed to open camera
    } else {
        Toast.makeText(this, "Camera not available", Toast.LENGTH_SHORT).show()
    }
}
