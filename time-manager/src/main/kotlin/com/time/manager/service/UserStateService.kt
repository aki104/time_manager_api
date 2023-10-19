package com.time.manager.service

import com.time.manager.core.stub.StubUser
import com.time.manager.presentation.form.LoginRequest
import org.springframework.stereotype.Service

@Service
class UserStateService {
    fun userCheck(request: LoginRequest): Boolean {
        val password = StubUser().password
        val companyId = StubUser().companyId
        val employeeId = StubUser().employeeId

        if (request.password == password && request.companyId == companyId && request.employeeId == employeeId) {
            return true
        }

        return false
    }
}