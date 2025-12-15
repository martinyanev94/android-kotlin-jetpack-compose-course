import android.content.Context
import android.hardware.biometrics.BiometricPrompt
import androidx.biometric.auth.AuthPromptInfo

fun authenticateUser(context: Context) {
    val biometricPrompt = BiometricPrompt(context, executor, callback)
    val promptInfo = BiometricPrompt.PromptInfo.Builder()
        .setTitle("Face ID Authentication")
        .setSubtitle("Use your Face ID to authenticate")
        .setNegativeButtonText("Cancel")
        .build()

    biometricPrompt.authenticate(promptInfo)
}
