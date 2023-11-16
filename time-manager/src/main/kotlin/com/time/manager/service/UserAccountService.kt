package com.time.manager.service

import com.time.manager.core.exception.NotExistException
import com.time.manager.core.stub.StubUser
import com.time.manager.presentation.form.LoginRequest
import org.springframework.stereotype.Service

@Service
class UserAccountService {
    fun userCheck(request: LoginRequest) {
        val password = StubUser().password
        val companyCode = StubUser().companyCode
        val mailOrEmployee : String? = if (request.employeeCode != null) {
            StubUser().employeeCode
        } else {
            StubUser().email
        }
        val requestEmailOrEmployee: String? = request.employeeCode ?: request.email

        //今は一旦スタブと比較して判定
        if (request.password == password && request.companyCode == companyCode && requestEmailOrEmployee == mailOrEmployee) {
            print("成功")
        } else {
            throw NotExistException(errorMessage = "ユーザーが存在しません")
        }

    }
}