package com.example.myapplication55

object RegisterUser {
    private val exixtingUsers = listOf("Rahul", "Rohan")

    fun validateUsers( name:String,
    password:String,
    confirmPassowrd:String):
            Boolean{
        if(name.isEmpty() || password.isEmpty() || confirmPassowrd.isEmpty() || name.isNullOrBlank()){
            return false
        }

        else if(name in exixtingUsers){
            return false
        }

        else if(password != confirmPassowrd){
            return false
        }

       else if (password.count { it.isDigit() } < 2){
            return false
        }

        return  true
    }

}