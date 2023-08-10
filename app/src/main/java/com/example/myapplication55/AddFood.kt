package com.example.myapplication55

object AddFood {
    fun validateFood(name:String, imageResourceId:String):Boolean{
        if(name.isEmpty() || imageResourceId.isEmpty()){
            return false
        }

        return true
    }
}