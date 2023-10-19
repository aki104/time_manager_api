package com.time.manager.presentation.form

import com.fasterxml.jackson.annotation.JsonProperty

//レスポンス
data class LoginResponse(
    val message: String
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
    @JsonProperty("company_id")
    val companyId: Int,
    @JsonProperty("employee_id")
    val employeeId: Int,
    val password: String,
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

