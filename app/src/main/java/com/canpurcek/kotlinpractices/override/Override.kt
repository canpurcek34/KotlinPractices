package com.canpurcek.kotlinpractices.override

fun main() {

    //animal superclass runs its own method
    val animal = Animals()
    animal.makeNoise() //no inheritance, has reached a class of its own method

    //mammal superclass runs animal superclass method
    val mammal = Mammal()
    mammal.makeNoise() //inheritance, has reached a superclass method

    //cat subclass runs its own method
    val cat = Cat()
    cat.makeNoise()//inheritance, has reached a class of its own method

    //dog subclass runs its own method
    val dog = Dog()
    dog.makeNoise()//inheritance, has reached a class of its own method
}