package com.sabine.apiforum.controller

import com.sabine.apiforum.dto.NewDtoTopic
import com.sabine.apiforum.model.Topic
import com.sabine.apiforum.service.TopicService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topics")

class TopicController(
    private val service: TopicService
) {

    @GetMapping
    fun list(): List<Topic> {
        return service.list()
    }

    @GetMapping("/{id}")
    fun searchById(@PathVariable id: Long): Topic {
        return service.searchById(id)
    }

    @PostMapping
    fun createTopic(@RequestBody dto: NewDtoTopic) {
        service.createTopic(dto)
    }
}