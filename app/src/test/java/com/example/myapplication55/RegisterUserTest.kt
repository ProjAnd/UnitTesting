package com.example.myapplication55

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
internal class RegisterUserTest {

    @Test
    fun `empty user name return false`() {
        val result = RegisterUser.validateUsers(
            "",
            "1234",
            "1234"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `username and correctly repeated password returns true`() {
        val result = RegisterUser.validateUsers(
            "Reema",
            "12345678",
            "12345678"
        )
        assertThat(result).isTrue()

    }

    // in this test userName already taken returns false
    @Test
    fun `username already taken returns false`() {
        val result = RegisterUser.validateUsers(
            "Rohan",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }

    // if confirm password does nt matches the password return false
    @Test
    fun `incorrect confirm password returns false`() {
        val result = RegisterUser.validateUsers(
            "Rahul",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    // in this test if password has less than two digits than return false
    @Test
    fun `less than two digit password return false`() {
        val result = RegisterUser.validateUsers(
            "Rahul",
            "abcd1",
            "abcd1"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `correct username empty passwords return false`() {
        val result = RegisterUser.validateUsers(
            "Rahul",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

}