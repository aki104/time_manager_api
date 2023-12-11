package com.time.manager.infrastructure.database.driver

import com.fasterxml.jackson.annotation.JsonCreator
import com.time.manager.domain.repository.UserRepository
import org.springframework.stereotype.Component

//
//@Component
//class UserDriver(private val userRepository: UserRepository) {
//    fun getTasks(): TasksJson {
//        return userRepository.findAll().map {
//            TaskJson(it.id, it.title, it.content)
//        }.let(::TasksJson)
//    }
//
//    fun getTask(taskId: Long): TaskJson {
//        return userRepository.findById(taskId)?.let {
//            TaskJson(it.id, it.title, it.content)
//        }
//    }
//
//    fun createTask(title: String, content: String?): Int {
//        return userRepository.insertTask(title, content)
//    }
//
//    fun updateTask(taskJson: TaskJson): Int {
//        return userRepository.updateTask(taskJson.id, taskJson.title, taskJson.content)
//    }
//
//    fun deleteTask(taskId: Long): Int {
//        return userRepository.deleteTask(taskId)
//    }
//}
//
//data class TasksJson @JsonCreator constructor(
//    val list: List<TaskJson>
//)
//
//data class TaskJson @JsonCreator constructor(
//    val id: Long,
//    val title: String,
//    val content: String?
//)