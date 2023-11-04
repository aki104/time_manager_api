package com.time.manager.service

import com.time.manager.core.exception.NotExistException
import com.time.manager.core.stub.StubUser
import com.time.manager.presentation.form.LoginRequest
import org.springframework.stereotype.Service

@Service
class UserAccountService {
    fun userCheck(request: LoginRequest) {
        val password = StubUser().password
        val companyId = StubUser().companyId
        val employeeId = StubUser().employeeId

        if (request.password == password && request.companyId == companyId && request.employeeId == employeeId) {
            print("成功")
        } else {
            throw NotExistException(errorMessage = "ユーザーが存在しません")
        }

    }
}