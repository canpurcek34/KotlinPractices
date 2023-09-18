package com.canpurcek.kotlinpractices.factorial

fun main(){

    val oop = Factorial()

    println("Input number: ")
    val num = readLine()!!.toInt()

    oop.factorial(num)

}