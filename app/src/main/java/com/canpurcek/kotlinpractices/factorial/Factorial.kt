package com.canpurcek.kotlinpractices.factorial

class Factorial {

    fun factorial(number: Int){

        var fact = 1

        for(i in 1..number){
            fact*=i
        }

        println("Factorial: $fact")
    }
}