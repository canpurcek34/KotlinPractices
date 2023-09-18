package com.canpurcek.kotlinpractices.letterfinder

fun main(){

    val oop = Finder()

    println("Input string: ")
    val str = readLine()!!

    println("Input letter: ")
    val ltr = readLine()!!

    oop.finder(str, ltr)
}