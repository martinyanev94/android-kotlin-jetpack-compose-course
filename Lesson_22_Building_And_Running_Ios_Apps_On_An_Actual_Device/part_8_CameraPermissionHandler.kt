if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) 
        != PackageManager.PERMISSION_GRANTED) {
    ActivityCompat.requestPermissions(this, 
        arrayOf(Manifest.permission.CAMERA), 
        REQUEST_CAMERA_PERMISSION)
} else {
    openCamera()
}
