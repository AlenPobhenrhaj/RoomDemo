package com.example.roomdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employee-table")
data class EmployeeEntity(
    @PrimaryKey(autoGenerate = true)
    var id : Int ? = null,

    var name:String ? = null,

    @ColumnInfo(name = "email-id")
    var email : String ? = null
)
