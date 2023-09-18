package com.canpurcek.kotlinpractices.areacalculator

fun main(){

    val oop = Calculator()

    println("Input a-side: ")
    val a = readLine()!!.toInt()

    println("Input b-side: ")
    val b = readLine()!!.toInt()

    oop.area(a,b)

}