package com.time.manager.infrastructure.database.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Table
import jakarta.persistence.Id

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue
    val id: Long = 0,

    @Column(name = "company_code", length = 100, nullable = false)
    val companyCode: String = "",

    @Column(name = "employee_code", length = 100, nullable = false)
    val employeeCode: String = "",
    @Column(name = "password", length = 100, nullable = false)
    val password: String = "",
    @Column(name = "email", length = 100, nullable = false)
    val email: String = "",
    @Column(name = "name", length = 100, nullable = false)
    val name: String = "",

)

data class StubUser(
    val userId: String = "1",
    val companyCode: String = "0001",
    val employeeCode: String? = "001",
    val password: String = "password1",
    val email: String? = "test@test.jp",
    val userName: String = "テスト太郎",
)
