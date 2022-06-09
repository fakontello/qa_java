package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

public class CatTest {


    private final Feline feline = new Feline();
    private final Cat cat = new Cat(feline);

    @Test
    public void getSoundReturnsCorrectValue() {
        // Arrange
        String expected = "Мяу";
        // Act
        String actual = cat.getSound();
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, cat.getFood());
    }
}