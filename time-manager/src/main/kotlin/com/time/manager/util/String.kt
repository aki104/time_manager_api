package com.time.manager.util

fun getRandomString() : String {
    val charset = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz0123456789"
    return (1..11)
        .map { charset.random() }
        .joinToString("")
}