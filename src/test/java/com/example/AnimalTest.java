package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, " +
                "мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
