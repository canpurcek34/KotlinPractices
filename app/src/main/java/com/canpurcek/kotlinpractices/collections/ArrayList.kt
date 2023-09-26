package com.canpurcek.kotlinpractices.collections

fun main() {

    //defining
    val numbers  = ArrayList<Int>()
    val fruits = ArrayList<String>()

    //adding data
    fruits.add("apple") //index 0.
    fruits.add("banana") //index 1.
    fruits.add("cherry") //index 2.
    fruits.add("melon") //index 3.

    println("***adding data***")
    println(fruits)


    //updating
    fruits[1] = "coconut"

    println("***updating data***")
    println(fruits)


    //insert(this method insert data not update or change)
    fruits.add(3,"tangerine")

    println("***insert data***")
    println(fruits)

    //read
    println("***get data***")
    println(fruits.get(3))

    //methods
    println("Size : ${fruits.size}")
    println("Item count : ${fruits.count()}")
    println("Is empty? : ${fruits.isEmpty()}")
    println("Contains : ${fruits.contains("tangerine")}")

    println("***reverse***")
    fruits.reverse() //this method reverse array
    println(fruits)

    println("***alphabetic sort***")
    fruits.sort() //alphabetic sorting
    println(fruits)

    //for loop iterating
    //this methods get value
    for (fruit in fruits){
        println("Result: $fruit")
    }

    //this methods get value with index
    for ((index, fruit) in fruits.withIndex()){
        println("$index --> $fruit")
    }

    //deleting data
    fruits.removeAt(3) //remove 3. index value(melon)
    println(fruits)

    fruits.clear()// this method clear all values from the array
    println("Is empty? : ${fruits.isEmpty()}")


}