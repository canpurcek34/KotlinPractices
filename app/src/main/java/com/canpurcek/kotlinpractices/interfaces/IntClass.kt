package com.canpurcek.kotlinpractices.interfaces

class IntClass: MyInterface {

    override val variable: Int = 10

    override fun method1() {
        println("Method 1 is working!")
    }

    override fun method2(): String {
        return "Method 2 is working!"
    }
}