package com.canpurcek.kotlinpractices.inheritance

fun main() {
    val topkapiPalace = Palace(5,100)

    val bosphorusVilla = Villa(true,15)

    println(topkapiPalace.tower)
    println(topkapiPalace.window)


    println(bosphorusVilla.garage)
    println(bosphorusVilla.window)

    if (topkapiPalace is Palace){
        println("This is a Palace.")
    }else{
        println("This is not a Palace.")
    }

    //Upcasting
    val home : Home = bosphorusVilla


    //Downcasting

    val home1 = Home(7)

    val palace = home1 as Palace

}