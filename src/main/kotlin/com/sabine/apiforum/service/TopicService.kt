package com.sabine.apiforum.service

import com.sabine.apiforum.dto.NewDtoTopic
import com.sabine.apiforum.model.Topic
import org.springframework.stereotype.Service

@Service
class TopicService(
    private var topics: List<Topic> = ArrayList(),
    private val courseService: CourseService,
    private val userService: UserService
) {

    fun list(): List<Topic> {
        return topics
    }

    fun searchById(id: Long): Topic {
        return topics.stream().filter({ t ->
            t.id == id
        }).findFirst().get()
    }

    fun createTopic(dto: NewDtoTopic) {
        topics = topics.plus(
            Topic(
                id = topics.size.toLong() +1,
                title = dto.title,
                message = dto.message,
                course = courseService.searchById(dto.courseId),
                author = userService.searchById(dto.authorId)
            ))
    }
}