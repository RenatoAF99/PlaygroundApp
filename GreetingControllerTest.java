package com.sky.playground.controllers;

import com.sky.playground.models.Greeting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GreetingControllerTest {


    private final GreetingController greetingController = new GreetingController();

    @Test
    void testName() {
        System.out.println("test case name");
        Greeting greeting = greetingController.greeting("World");
        Assertions.assertEquals("Hello, World!", greeting.getContent());
    }

}
