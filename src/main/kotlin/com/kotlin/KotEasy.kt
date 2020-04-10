package com.kotlin

import java.io.File

fun main() {
   // val s = File("text.txt").bufferedReader().readText()
    for(i in 1..5){
        print(i)
        println(if(i%2==0)"*" else "" )
    }
}