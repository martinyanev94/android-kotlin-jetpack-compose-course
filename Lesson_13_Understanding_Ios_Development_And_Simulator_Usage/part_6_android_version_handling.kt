val currentVersion = Build.VERSION.SDK_INT
when (currentVersion) {
    Build.VERSION_CODES.O -> { /* Do something specific for Oreo */ }
    Build.VERSION_CODES.P -> { /* Do something for Pie */ }
    else -> { /* General case for other versions */ }
}
