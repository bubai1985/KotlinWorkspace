package com.example.program

fun main(args: Array<String>) {
    val mutable: MutableList<Int> = mutableListOf(1, 2, 3)
    val readonly: List<Int> = mutableListOf(10, 11, 12)
    mutable.add(4)
    println(mutable)
    println(readonly)
    println(readonly.filter { it % 2 == 0 })
}