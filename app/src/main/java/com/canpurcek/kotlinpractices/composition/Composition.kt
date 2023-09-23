package com.canpurcek.kotlinpractices.composition

fun main() {

    val c1 = Categories(1,"Drama")
    val c2 = Categories(2,"Comedy")
    val c3 = Categories(3,"Science-Fiction")

    val d1 = Directors(1,"Nuri Bilge Ceylan")
    val d2 = Directors(2,"Quentin Tarantino")
    val d3 = Directors(3,"Christopher Nolan")

    val m1 = Movies(1,"Django",2013,c1.toString(),d2)

    println(m1)


}