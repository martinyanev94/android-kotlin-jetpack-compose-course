val runButton: View = findViewById(R.id.run_button)
runButton.setOnClickListener {
    val deviceId: String = "YOUR_DEVICE_ID"
    buildAndRunApp(deviceId)
}
