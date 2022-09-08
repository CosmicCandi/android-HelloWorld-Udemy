package com.example.cosmiccandi.helloworld

data class User(val id: Long, var name: String)

fun main() {
    val cosmicCandi = User(1, "CosmicCandi")

    val userAlias = User(1, "Kalea")
    userAlias.name = "CosmicCandi"
    println(cosmicCandi == userAlias)

    println("User Details: ID: ${cosmicCandi.toString()}")

    println(cosmicCandi.component1())
    println(cosmicCandi.component2())

    val (id, name) = cosmicCandi
    println("ID: $id, Name: $name")
}
