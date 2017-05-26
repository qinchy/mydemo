package com.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Assert;
import org.junit.Test;

public class AssertTests {

    @Test
    public void testAssertArrayEquals() throws UnsupportedEncodingException{
        byte[] expected = "trial".getBytes("UTF-8");
        byte[] actual = "trial".getBytes("UTF-8");
        org.junit.Assert.assertArrayEquals("failure - byte arrays not same", expected, actual);
    }

    @Test
    public void testAssertEquals() {
        org.junit.Assert.assertEquals("failure - strings not same", 5l, 5l);
    }

    @Test
    public void testAssertFalse() {
        org.junit.Assert.assertFalse("failure - should be false", false);
    }

    @Test
    public void testAssertNotNull() {
        org.junit.Assert.assertNotNull("should not be null", new Object());
    }

    @Test
    public void testAssertNotSame() {
        org.junit.Assert.assertNotSame("should not be same Object", new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        org.junit.Assert.assertNull("should be null", null);
    }

    @Test
    public void testAssertSame() {
//        Integer aNumber = new Integer(56);
//        Integer bNumber = new Integer(56);
        Integer aNumber = 56;
        Integer bNumber = 56;
        org.junit.Assert.assertSame("should be same", aNumber, bNumber);
    }

    // JUnit Matchers assertThat
    @Test
    public void testAssertThatBothContainsString() {
        org.junit.Assert.assertThat("albumen", both(containsString("al")).and(containsString("bu")));
    }

    @Test
    public void testAssertThathasItemsContainsString() {
        org.junit.Assert.assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
    }

    @Test
    public void testAssertThatEveryItemContainsString() {
        org.junit.Assert.assertThat(Arrays.asList(new String[]{"fun", "ban", "net"}), everyItem(containsString("n")));
    }

    // Core Hamcrest Matchers with assertThat
    @Test
    public void testAssertThatHamcrestCoreMatchers() {
        assertThat("good", allOf(equalTo("good"), startsWith("good"),startsWith("g")));
        assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
        assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
        assertThat(7, not(CombinableMatcher.<Integer>either(equalTo(3)).or(equalTo(4))));
        assertThat(new Object(), not(sameInstance(new Object())));

        Object a = new Object();
        Object b = a;
        assertThat(a, sameInstance(b));
    }

    @Test
    public void testAssertMethod() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        Assert.assertArrayEquals("数组元素相等", a, b);
    }
}  