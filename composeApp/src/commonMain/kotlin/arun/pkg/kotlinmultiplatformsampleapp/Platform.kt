package arun.pkg.kotlinmultiplatformsampleapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform