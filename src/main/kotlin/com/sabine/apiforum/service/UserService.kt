package com.sabine.apiforum.service

import com.sabine.apiforum.model.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(var users: List<User>) {

    init {
        val user = User(
            id = 1,
            name = "Mary Ann",
            email = "mary@example.com"
        )
        users = Arrays.asList(user)
    }

    fun searchById(id: Long): User {
        return users.stream().filter({ u -> u.id == id }).findFirst().get()
    }

}
