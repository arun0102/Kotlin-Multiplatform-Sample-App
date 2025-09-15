package arun.pkg.kotlinmultiplatformsampleapp

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    App(
        batteryManager = BatteryManager()
    )
}