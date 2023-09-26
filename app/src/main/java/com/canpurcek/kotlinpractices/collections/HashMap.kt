package com.canpurcek.kotlinpractices.collections

fun main() {

    //Dictionary
    val provinces = HashMap<Int,String>()

    provinces.put(52, "Ordu")
    provinces.put(33, "Mersin")
    provinces.put(19, "Çorum")

    println(provinces)

    //read
    println(provinces.get(19))

    //update
    provinces.put(19, "Kahraman Çorum")
    println(provinces)

    println(provinces.size)
    println(provinces.isEmpty())

    for ((key, value) in provinces){
        println("$key --> $value")
    }

    provinces.remove(19)
    println(provinces)

    provinces.clear()
    println(provinces.isEmpty())


}