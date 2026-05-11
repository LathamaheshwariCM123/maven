package com.example.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest{

    @Test
    public void test(){
        assertEquals("Hello Student",App.greet("Student"));
    }
}
