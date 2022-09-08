package com.example.cosmiccandi.helloworld

import kotlin.reflect.typeOf

fun main() {
    var kalea = Person("Kalea", "Wolff", 6)
    kalea.stateHobby()
    var john = Person()
    var johnPetersen = Person(_lastName = "Petersen")
    johnPetersen.hobby = "crow calling"
    johnPetersen.stateHobby()

    var kaleasPhone = MobilePhone()
    var heathersPhone = MobilePhone(brand="LG", model = "L555DL")
    var rikkisPhone = MobilePhone("iOS", "Apple", "iPhone Max 13")

    var myCar = Car()
    myCar.owner = kalea.firstName!!
    println("My car belongs to: ${myCar.owner}")

}

class Car(owner: String = "") {
    lateinit var owner : String
    val myBrand: String = "BMW"

    init {
        this.owner = owner
    }
}

class Person(_firstName: String = "John", _lastName: String = "Doe"){
    var firstName: String? = _firstName
    var lastName: String? = _lastName
    var age: Int? = null
    var hobby: String? = "Miniature Painting"

    constructor(_firstName: String, _lastName: String, age: Int): this(_firstName, _lastName) {
        this.age = age
    }

    init {
        println("Initialized a new person with first name: $firstName and last name: $lastName")
    }

    fun stateHobby() {
        println("${this.firstName} ${this.lastName}'s hobby is: $hobby")
    }
}

class MobilePhone(osName: String = "Android", brand: String = "Samsung", model: String = "Note 20 Ultra"){

    init {
        println("A new phone was created at the factory! Brand: $brand, Model: $model, OS: $osName")
        if (osName == "iOS"){
            println("Oh, it's an Apple. Let's send it for immediate destruction!")
        }
    }
}