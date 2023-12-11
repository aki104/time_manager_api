package com.time.manager.domain.repository

import com.time.manager.infrastructure.database.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository : JpaRepository<User, Int>

