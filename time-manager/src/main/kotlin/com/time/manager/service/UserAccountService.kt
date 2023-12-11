package com.time.manager.service

import com.time.manager.core.exception.NotExistException
import com.time.manager.domain.repository.UserRepository
import com.time.manager.infrastructure.database.entity.User
import com.time.manager.presentation.form.LoginRequest
import org.springframework.stereotype.Service

@Service
class UserAccountService(private val userRepository: UserRepository) {

    //ユーザーの存在チェック
    fun userCheck(request: LoginRequest): User? {
        val companyUsers = userRepository.findAll().filter { el -> el.companyCode == request.companyCode }
        var user: User? = null

        if (companyUsers.isNotEmpty()) {
            companyUsers.forEach {
                val password = it.password
                val companyCode = it.companyCode
                val mailOrEmployee: String = if (request.employeeCode != null) {
                    it.employeeCode
                } else {
                    it.email
                }
                val requestEmailOrEmployee: String? = request.employeeCode ?: request.email

                if (request.password == password && request.companyCode == companyCode && requestEmailOrEmployee == mailOrEmployee) {
                    user = it
                }
            }

            if (user == null) {
                throw NotExistException(errorMessage = "一致するユーザーが存在しません")
            }
        } else {
            throw NotExistException(errorMessage = "ユーザーが存在しません")
        }
        return user
    }
}