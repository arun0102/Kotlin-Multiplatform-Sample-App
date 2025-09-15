package arun.pkg.kotlinmultiplatformsampleapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinMultiplatformSampleApp",
    ) {
        App(
            batteryManager = BatteryManager()
        )
    }
}