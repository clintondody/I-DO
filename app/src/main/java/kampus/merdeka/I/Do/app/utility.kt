package kampus.merdeka.I.Do.app

import android.view.Window
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat

fun setFullScreen(window : Window){
    WindowCompat.setDecorFitsSystemWindows(window, false)
}

fun lighStatusBar(window: Window, isLight: Boolean = true){
    val wic = WindowInsetsControllerCompat(window, window.decorView)
    wic.isAppearanceLightStatusBars = isLight

}