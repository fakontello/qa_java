package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFamilyReturnsFamilyType() {
        // Arrange
        String expected = "Кошачьи";
        // Assert
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturnsCorrectValue() {
        // Assert
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensReturnsCount() {
        // Assert
        Assert.assertEquals(1, feline.getKittens(1));
    }

    @Test
    public void testFelineEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }
}
