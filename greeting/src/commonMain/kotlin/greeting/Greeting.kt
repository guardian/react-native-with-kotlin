package greeting

expect object Platform {
    fun name(): String
}

fun hello(): String = "${Platform.name()} says \"Hello\""