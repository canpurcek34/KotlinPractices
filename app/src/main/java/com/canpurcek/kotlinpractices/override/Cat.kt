package com.canpurcek.kotlinpractices.override

class Cat:Mammal() {

    override fun makeNoise() {
        println("Meow Meow!")
    }
}