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

    //sorting
    println("**Numeric Sorting: From small to big**")
    val sorting1 = students.sortedWith(compareBy{it.no}) //ASC : ascend
    for (stu in sorting1){
        println("No: ${stu.no} - Name: ${stu.name} - Class: ${stu.lesson}")
    }

    println("**Numeric Sorting: From big to small**")
    val sorting2 = students.sortedWith(compareByDescending{it.no}) //DESC : descend
    for (stu in sorting2){
        println("No: ${stu.no} - Name: ${stu.name} - Class: ${stu.lesson}")
    }

    println("**Alphabetic Sorting**")
    val sorting3 = students.sortedWith(compareBy{it.name})
    for (stu in sorting3){
        println("No: ${stu.no} - Name: ${stu.name} - Class: ${stu.lesson}")
    }

    //filtering
    println("Filtering 1:")
    val filter1 = students.filter {it.no > 200} //this method filters out those greater than 200
    for (stu in filter1){
        println("No: ${stu.no} - Name: ${stu.name} - Class: ${stu.lesson}")
    }

    println("Filtering 2:")
    val filter2 = students.filter {(it.name).contains("g")} //this method filters out those contains g char
    for (stu in filter2){
        println("No: ${stu.no} - Name: ${stu.name} - Class: ${stu.lesson}")
    }


}

