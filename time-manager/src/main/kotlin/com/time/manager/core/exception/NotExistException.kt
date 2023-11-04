package com.time.manager.core.exception

class NotExistException(var errorMessage: String) : Exception() {
    fun notExistException(errorMessage: String) {
        this.errorMessage = errorMessage
    }
}