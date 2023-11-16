package com.oriol.frutafacil

class UserProvider {
    companion object{
        val userList = listOf<User>(
            User(
                "https://cursokotlin.com/wp-content/uploads/2017/07/thor-150x150.jpg",
                "Yanis",
                "ydahmani05",
                "ydahmani@gmail.com",
                "22-02-2005"
            ),
            User(
                "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg",
                "Sergi",
                "sguasp04",
                "sergiguasp6@gmail.com",
                "15-10-2004"
            ),
            User(
                "https://cursokotlin.com/wp-content/uploads/2017/07/batman-150x150.jpg",
                "Oriol",
                "ocabrera00",
                "uri.cabrera2000@gmail.com",
                "30-07-2000"
            ),
        )
    }
}