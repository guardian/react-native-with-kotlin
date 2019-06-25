package greeting

expect object Platform {
    fun name(): String
}

fun hello(): String = "Running on ${Platform.name()}"