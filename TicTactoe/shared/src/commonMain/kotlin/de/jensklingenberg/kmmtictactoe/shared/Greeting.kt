package de.jensklingenberg.kmmtictactoe.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
