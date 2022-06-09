package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalConstructorTest {

    @Mock
    Animal animal;

    private final String animalKind;
    private final List<String> foodType;

    public AnimalConstructorTest(String animalKind, List<String> foodType) {
        this.animalKind = animalKind;
        this.foodType = foodType;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodTypes() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void testGetFood() throws Exception {
        animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        Assert.assertEquals(foodType, actual);
    }
}
