package com.time.manager.presentation.form

import com.fasterxml.jackson.annotation.JsonProperty

//レスポンス
data class LoginResponse(
    @JsonProperty("user_id")
    val userId: String,
    @JsonProperty("auth_token")
    val authToken: String
)

data class LogoutResponse(
    val message: String
)

data class SignUpResponse(
    val message: String
)

data class WithdrawalResponse(
    val message: String
)


//リクエスト
data class LoginRequest(
    @JsonProperty("company_code")
    val companyCode: String,
    @JsonProperty("employee_code")
    val employeeCode: String?,
    val password: String,
    val email: String?
)

data class SignUpRequest(
    val userId: Int,
    val attendanceId: Int,
    val startTime: String?,
    val endTime: String?,
    val restTime: String?
)

data class WithdrawalRequest(
    val userId: Int,
    val attendanceId: Int,
    val startTime: String?,
    val endTime: String?,
    val restTime: String?
)

data class LogoutRequest(
    val userId: Int,
    val attendanceId: Int,
    val startTime: String?,
    val endTime: String?,
    val restTime: String?
)

