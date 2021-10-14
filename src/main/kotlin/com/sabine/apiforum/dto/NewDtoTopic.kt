package com.sabine.apiforum.dto

data class NewDtoTopic(
    val title: String,
    val message: String,
    val courseId: Long,
    val authorId: Long
)