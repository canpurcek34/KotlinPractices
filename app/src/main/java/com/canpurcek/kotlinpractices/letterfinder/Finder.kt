package com.canpurcek.kotlinpractices.letterfinder

class Finder {

    fun finder(str: String, ltr: String){


        val res = str.count {it.toString() == ltr}

        println("Result: $res")

    }
}