package com.canpurcek.kotlinpractices.collections

fun main() {

    val stu1 = Students(197, "Emrecan", "12C")
    val stu2 = Students(333, "Kemal", "12A")
    val stu3 = Students(156, "Müge", "12F")

    val students = ArrayList<Students>()

    students.add(stu1)
    students.add(stu2)
    students.add(stu3)

    for (stu in students){
        println("No: ${stu.no} - Name: ${stu.name} - Class: ${stu.lesson}")

    }

}