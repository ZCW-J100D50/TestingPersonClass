package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Character expectedGen = '\0';
        Float expectedHet = 0f;
        Integer expectedWgt = 0;

        // When
        Person person = new Person();

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Character actualGen = person.getGender();
        Float actualHet = person.getHeight();
        Integer actualWgt = person.getWeight();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedGen, actualGen);
        Assert.assertEquals(expectedHet, actualHet);
        Assert.assertEquals(expectedWgt, actualWgt);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = Integer.MAX_VALUE;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Character expectedGen = 'M';
        Float expectedHet = 70.2f;
        Integer expectedWgt = 170;

        // When
        Person person = new Person(expectedName, expectedAge, expectedGen, expectedHet, expectedWgt);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Character actualGen = person.getGender();
        Float actualHet = person.getHeight();
        Integer actualWgt = person.getWeight();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedGen, actualGen);
        Assert.assertEquals(expectedHet, actualHet);
        Assert.assertEquals(expectedWgt, actualWgt);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGen() {
        // Given
        Person person = new Person();
        Character expectedGen = 'M';

        // When
        person.setGender(expectedGen);


        // Then
        Character actualGen = person.getGender();

        Assert.assertEquals(expectedGen, actualGen);

        }
    @Test
    public void testSetHgt() {
        // Given
        Person person = new Person();
        Float expectedHgt = 55.2f;

        // When
        person.setHeight(expectedHgt);


        // Then
        Float actualHgt = person.getHeight();

        Assert.assertEquals(expectedHgt, actualHgt);
    }
    @Test
    public void testSetWgt() {
        // Given
        Person person = new Person();
        Integer expectedWgt = 170;

        // When
        person.setWeight(expectedWgt);


        // Then
        Integer actualWgt = person.getWeight();

        Assert.assertEquals(expectedWgt, actualWgt);
    }

}
