package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class LionTest {

    Feline feline = new Feline();
    Lion lion = new Lion("Самец", feline);

    public LionTest() throws Exception {
    }

    @Test
    public void testGetKittensReturnsCorrectValue() {
        // Assert
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFoodMethod() throws Exception {
        // Act
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        // Assert
        Assert.assertEquals(expected, lion.getFood());
    }

    @Test
    public void testLionSexException() {
        // Assert
        Assert.assertThrows(Exception.class,() -> new Lion("ываыва",new Feline()));
    }
}