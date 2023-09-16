package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    SumCalculator sumCalculator;

    @BeforeEach
    public void initSumCalculator(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void testThatOneHandledCorrect(){
        Assertions.assertEquals(1,sumCalculator.sum(1));
    }
    @Test
    public void testThatZeroHandledCorrect(){
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> sumCalculator.sum(0)
        );
    }
    @Test
    public void testThatThreeHandledCorrect(){
        Assertions.assertEquals(6,sumCalculator.sum(3));
    }
    @Test
    public void testTooBigNumber(){
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sumCalculator.sum(10000000)
        );
    }
}
