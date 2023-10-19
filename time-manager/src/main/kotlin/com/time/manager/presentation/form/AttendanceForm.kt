package com.time.manager.presentation.form

import com.fasterxml.jackson.annotation.JsonProperty

data class AttendanceSaveResponse(
    val message: String
)

data class AttendanceEditResponse(
    val message: String
)

data class AttendanceSaveRequest(
    @JsonProperty("user_id")
    val userId: Int,
    @JsonProperty("company_id")
    val companyId: Int,
    @JsonProperty("employee_id")
    val employeeId: Int,
    @JsonProperty("auth_token")
    val authToken: String,
    @JsonProperty("push_time")
    val pushTime: String,
    @JsonProperty("attendance_status")
    val attendanceStatus: Int
)

data class AttendanceEditRequest(
    val userId: Int,
    val attendanceId: Int,
    val startTime: String?,
    val endTime: String?,
    val restTime: String?
)