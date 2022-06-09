package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, " +
                "мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
