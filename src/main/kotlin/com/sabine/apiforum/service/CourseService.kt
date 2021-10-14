package com.sabine.apiforum.service

import com.sabine.apiforum.model.Course
import org.springframework.stereotype.Service
import java.util.*

@Service
class CourseService(var courses: List<Course>) {

    init {
        val course = Course(
            id = 1,
            name = "Kotlin",
            category = "Backend"
        )
        courses = Arrays.asList(course)
    }

    fun searchById(id: Long): Course{
        return courses.stream().filter({
            c -> c.id == id
        }).findFirst().get()
    }


}
