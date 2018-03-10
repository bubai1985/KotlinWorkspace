package com.example.program

import org.jetbrains.annotations.Mutable

fun main(args: Array<String>) {
    val data: Int = 10
    if(data <= 11) {
        println("True data")
    } else {
        println("False data")
    }

    if(data in 1..10) { //  1<=i and i<=10
        println("Yahoo")
    }
}