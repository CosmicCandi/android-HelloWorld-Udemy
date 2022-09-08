package com.example.cosmiccandi.helloworld

import kotlin.random.Random

data class Battery (var previousLevel: Int = 0, var currentLevel: Int = 0, ) {

    init {
        previousLevel = 0
        currentLevel = Random.nextInt(0, 51)
    }

    fun chargeBattery(percentToCharge: Int) {
        var updatedCurrentLevel = this.currentLevel
        previousLevel = this.currentLevel
        //TODO Make this charge percentage variable
        updatedCurrentLevel += percentToCharge
        println("The battery was previously at: ${previousLevel}%. It was charged: ${percentToCharge}%, and is now at: ${updatedCurrentLevel}%")
    }
}
