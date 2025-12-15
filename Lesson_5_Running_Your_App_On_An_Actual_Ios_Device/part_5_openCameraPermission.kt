fun openCamera() {
    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
    startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
}
<uses-permission android:name="android.permission.CAMERA" />
