package com.canpurcek.kotlinpractices.converter

fun main(){

    val oop = Converter()

    println("Input km: ")
    val km = readLine()!!.toInt()

    oop.convert(km)

}