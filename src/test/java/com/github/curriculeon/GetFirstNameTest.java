package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/16/2019.
 */
public class GetFirstNameTest {
    //given
    private void test(String expectedFirstName) {
        Person person = new Person();
        person.setFirstName(expectedFirstName);
        System.out.println("Expected First Name "+expectedFirstName);

        // when
        String actualFirstName = person.getFirstName();
        System.out.println("actual1 "+person.getFirstName());
        System.out.println("actual2 "+actualFirstName);
        // then
        Assert.assertEquals(expectedFirstName, actualFirstName);
    }

    @Test
    public void test0() {
        test("Leon");
    }

    @Test
    public void test1() {
        test("Hunter");
    }

    @Test
    public void test2() {
        test("Ali");
    }
}
