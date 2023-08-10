package com.example.myapplication55

import com.google.common.truth.Truth
import org.junit.Test

class AddFoodTest{

    @Test
    fun `empty user name return false`() {
        val result = AddFood.validateFood(
            "",
            "1234"
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `username and correctly repeated password returns true`() {
        val result = AddFood.validateFood(
            "Reema",
            "12345678"
        )
        Truth.assertThat(result).isTrue()
    }

    // in this test userName already taken returns false
    @Test
    fun `username already taken returns false`() {
        val result = AddFood.validateFood(
            "Rohan",
            "123"
        )
        Truth.assertThat(result).isFalse()
    }

    //if confirm password does nt matches the password return false
    @Test
    fun `incorrect confirm password returns false`() {
        val result = AddFood.validateFood(
            "Rahul",
            "123"
        )
        Truth.assertThat(result).isFalse()
    }

 
    @Test
    fun `correct username empty passwords return false`() {
        val result = AddFood.validateFood(
            "",
            ""
        )
        Truth.assertThat(result).isFalse()
    }

}