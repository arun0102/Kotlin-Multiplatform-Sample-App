package arun.pkg.kotlinmultiplatformsampleapp

expect class BatteryManager {
    fun getBatteryLevel(): Int
}