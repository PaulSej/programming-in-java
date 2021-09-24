package agh.ii.prinjava.lab01.lst01_01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloEncapsulationTest {

    @BeforeEach
    void setUp() {
        System.out.println("HelloEncapsulation.setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("HelloEncapsulation.tearDown");
    }

    @Test
    void getPropVal() {
        HelloEncapsulation v1 = new HelloEncapsulation(100);
        int value = v1.getPropVal();
        value = value + 1;
        assertEquals(100, v1.getPropVal());
        v1.setPropVal(value);
        assertEquals(101, v1.getPropVal());
    }
}