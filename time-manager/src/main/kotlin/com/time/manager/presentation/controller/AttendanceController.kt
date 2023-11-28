
package com.time.manager.presentation.controller

import com.time.manager.presentation.form.AttendanceEditRequest
import com.time.manager.presentation.form.AttendanceEditResponse
import com.time.manager.presentation.form.AttendanceSaveRequest
import com.time.manager.presentation.form.AttendanceSaveResponse

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("attendance")
class AttendanceController {

    //勤怠登録(/attendance/save)
    @PostMapping("/save")
    fun saveAttendance(@RequestBody request: AttendanceSaveRequest): AttendanceSaveResponse {
        print("request :${request}")
        return try {
            if (request.attendanceStatus == 1) {
                //startTimeの登録
                print(request.pushTime)
            } else {
                //endTimeの登録
                print(request.pushTime)
            }
            AttendanceSaveResponse(request.pushTime)
        } catch (e: Exception){
            print(e.message)
            AttendanceSaveResponse(e.message.toString())
        }
    }

    //勤怠編集(/attendance/edit)
    @PostMapping("/edit")
    fun editAttendance(@RequestBody request: AttendanceEditRequest): AttendanceEditResponse {
        return try {
            //編集データ登録
            AttendanceEditResponse("OK")
        } catch (e: Exception){
            print(e.message)
            AttendanceEditResponse(e.message.toString())
        }
    }

}
