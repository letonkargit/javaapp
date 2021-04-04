package com.japp.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("junit")
class JHomeControllerTest {
    @Autowired JHomeController jHomeController;

    @Test
    public void testSayHello(){
        assertNotNull(jHomeController.sayhello());
        assertEquals("Hello!", jHomeController.sayhello());
    }
}