package com.example.myapplication55

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class AddStatusTest{

    @Test
    fun `status correct return true`(){
        val result =
            AddStatus.validateStatus("Hi How are you")

        assertThat(result).isTrue()
    }

    @Test
    fun `status is null or black return false`(){
        val result = AddStatus.validateStatus("")
        assertThat(result).isFalse()
    }

    @Test
    fun `status already existed retrun false`(){
        val result = AddStatus.validateStatus("Reema")
        assertThat(result).isFalse()
    }

}