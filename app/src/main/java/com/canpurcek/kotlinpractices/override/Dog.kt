package com.canpurcek.kotlinpractices.override

class Dog: Mammal() {

    override fun makeNoise() {
        println("Bark Bark!")
    }
}