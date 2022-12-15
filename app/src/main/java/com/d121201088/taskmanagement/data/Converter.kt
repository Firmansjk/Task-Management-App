package com.d121201088.taskmanagement.data

import androidx.room.TypeConverter
import com.d121201088.taskmanagement.data.models.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }

}