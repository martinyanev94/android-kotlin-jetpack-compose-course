import android.os.VibrationEffect
import android.os.Vibrator

fun provideHapticFeedback(vibrator: Vibrator, duration: Long) {
    if (vibrator.hasVibrator()) {
        val effect = VibrationEffect.createOneShot(duration, VibrationEffect.DEFAULT_AMPLITUDE)
        vibrator.vibrate(effect)
    }
}
