package com.canpurcek.kotlinpractices.intermadiate

import java.lang.Exception

fun main() {
    //1. Compile Error
    /**val x = 10
    x = 300**/


    //2. Exception Error - Runtime Error

    println("***if there is no error***")
    var a = 10
    var b = 2

    try {

        println("Result: ${a/b}")
        println("Task finished!")

    }catch (e:Exception){
        println("Second number not will be zero!")
    }



    println("***if there is error***")
    a = 10
    b = 0

    try {

        println("Result: ${a/b}")
        println("Task finished!")

    }catch (e:Exception){
        println("Second number not will be zero!")
    }

}