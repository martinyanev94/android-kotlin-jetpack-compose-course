private fun requestCameraPermission() {
    if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), CAMERA_REQUEST_CODE)
    } else {
        initCamera()
    }
}

override fun onRequestPermissionsResult(requestCode: Int, grants: IntArray) {
    super.onRequestPermissionsResult(requestCode, grants)
    if (requestCode == CAMERA_REQUEST_CODE && grants.isNotEmpty() && grants[0] == PackageManager.PERMISSION_GRANTED) {
        initCamera()
    }
}
