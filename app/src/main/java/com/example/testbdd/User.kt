package com.example.testbdd

import androidx.appcompat.app.AppCompatActivity

class User {
    var id : Int = 0
    var name : String? = null
    var age : Int = 0

    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }
}