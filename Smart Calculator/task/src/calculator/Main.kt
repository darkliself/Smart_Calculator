package calculator

import kotlin.system.exitProcess

fun main() {
    while (true) {
        when (val str = readLine()!!) {
            "/exit" -> {
                println("Bye!")
                break
            }
            "/help" -> println("this is help")
            else -> {
                if (str.isNotEmpty()) {
                    println(str.replace("--", "+")
                        .replace("\\++".toRegex(), "+")
                        .replace("+", "")
                        .replace("- ", "-")
                        .replace("\\s+".toRegex(), " ")
                        .split(" ").sumOf { it.toInt() })
                }
            }
        }
    }
}

