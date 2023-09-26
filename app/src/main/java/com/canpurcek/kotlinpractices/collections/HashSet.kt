package com.canpurcek.kotlinpractices.collections

fun main() {
    val fruits = HashSet<String>()

    fruits.add("Apple")
    fruits.add("Cherry")
    fruits.add("Banana")
    fruits.add("Orange")

    println(fruits)

    fruits.add("Strawberry")
    println(fruits)

    println(fruits.elementAt(1))
    println(fruits.size)
    println(fruits.isEmpty())


    for (fru in fruits){
        println("Fruit: $fru")
    }

    for ((index, fru) in fruits.withIndex()){
        println("$index. --> $fru")
    }

    fruits.remove("Apple")
    println(fruits)

    fruits.clear()
    println(fruits.isEmpty())
}