package com.java

// In Kotlin public is the default visibility, so you can simply omit it.
class User(val nickname: String)

fun main(args: Array<String>) {
    val user = User("cat")

    println(user.nickname)
}