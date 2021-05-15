package com.example.kotlin_1

class Dic(private val sides: Int) {
    fun rollDic(): Int {
        return (1..sides).random()
    }
}