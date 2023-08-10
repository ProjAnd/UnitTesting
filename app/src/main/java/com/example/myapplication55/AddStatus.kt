package com.example.myapplication55

object AddStatus {

    val existingstatus = listOf("Rahul", "Reema", "Revi")

    fun validateStatus(status:String) :Boolean{
        if(status.isEmpty() || status.isNullOrBlank()){
            return  false
        }

        if(status  in existingstatus){
            return  false
        }

        return true
    }
}