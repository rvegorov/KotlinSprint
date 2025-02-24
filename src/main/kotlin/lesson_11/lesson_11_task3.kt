package org.example.lesson_11

class RoomUser(
    val name: String,
    val avatar: String = "blank.jpg",
    var status: String = "разговаривет"
) {
}

class Room(
    val roomName: String,
    val users: MutableList<RoomUser>,
    val roomCover: String = "empty.jpg",
) {
    fun addUser(user: RoomUser) {
        if (users.none { it.name == user.name }) users.add(user)
    }

    fun changeUserStatus(userName: String, newUserStatus: String) {
        for (user in users) {
            if (user.name == userName) user.status = newUserStatus
        }
    }
}

fun main() {
    val room = Room(
        roomName = "Ребята", mutableListOf(RoomUser("Олег"), RoomUser("Маша")),
        "rebyata.png",
    )
}