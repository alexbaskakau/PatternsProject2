package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.netology.DataGenerator.Registration.getRegisteredUser;

public class AuthTest {
    @BeforeEach
    void setUp() {
        open("http://localhost:7777");
    }
    @Test
    public void shouldLoginActiveRegisteredUser() {
        var registeredUser = getRegisteredUser("active");
        $("[data-test-id='login'] input").setValue(registeredUser.getLogin());
        $("[data-test-id='password' input").setValue(registeredUser.getPassword());
    }

}
