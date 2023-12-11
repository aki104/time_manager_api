package com.time.manager.presentation.controller

import com.time.manager.presentation.form.*
import com.time.manager.service.UserAccountService
import com.time.manager.util.getRandomString
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserAccountController(private val service: UserAccountService) {
    @PostMapping("/login")
    fun login(@RequestBody request: LoginRequest): LoginResponse {
        print("request :${request}")
        val user = service.userCheck(request)
       return  LoginResponse(user!!.id.toString(), authToken = getRandomString())
    }

//    @PostMapping("/logout")
//    fun logout(@RequestBody request: LogoutRequest): LogoutResponse {
//        print("request :${request}")
//        return  LogoutResponse("aa")
//    }
//
//    @PostMapping("/signup")
//    fun signup(@RequestBody request: SignUpRequest): SignUpResponse {
//        print("request :${request}")
//        return  SignUpResponse("aa")
//    }
//
//    @PostMapping("/withdrawal")
//    fun  withdrawal(@RequestBody request: WithdrawalRequest): WithdrawalResponse {
//        print("request :${request}")
//        return  WithdrawalResponse("aa")
//    }
}