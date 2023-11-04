package com.time.manager.core.errorHandler

import ErrorResponse
import com.time.manager.core.exception.NotExistException
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.*
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
//
//@RestControllerAdvice
//class ApiControllerHandler : ResponseEntityExceptionHandler(){
//    //  リクエストに入る値の型が異なる場合、エラーとなる
//    override fun handleHttpMessageNotReadable(
//        ex: HttpMessageNotReadableException,
//        headers: HttpHeaders,
//        status: HttpStatusCode,
//        request: WebRequest
//    ): ResponseEntity<Any>? {
//        headers.contentType = MediaType(MediaType.APPLICATION_JSON)
//        val res = ResponseError(
//            status = HttpStatus.BAD_REQUEST.value(),
//            message = "リクエストの値が異なります"
//        )
//        return handleExceptionInternal(ex, res, headers, status, request)
//    }
//}
//
//// エラーレスポンス用のクラス
//class ResponseError(
//    val status: Int,
//    val message: String?
//
//)

@RestControllerAdvice
class RequestExceptionHandler {
    /**
     * NotExistExceptionのハンドラー
     */
    @ExceptionHandler(NotExistException::class)
    fun getException(req: HttpServletRequest, error: NotExistException): ResponseEntity<ErrorResponse> {
        return ErrorResponse.createResponse(error)
    }
}







