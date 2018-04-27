package com.grunka.random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RFC11495Test {
    private RFC11495 random;

    @Before
    public void setUp() {
        random = new RFC11495();
    }

    @Test
    public void shouldReturnTheCorrectNumber() {
        assertEquals(4, random.nextInt());
        assertEquals(4, random.nextLong());
        assertEquals(4, random.nextLong());
        assertEquals(4, random.nextGaussian(), 0);
        assertEquals(4, random.nextFloat(), 0);
        assertEquals(4, random.nextDouble(), 0);

        byte[] bytes = new byte[5];
        random.nextBytes(bytes);
        assertArrayEquals(new byte[]{(byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4}, bytes);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowAndIncorrectRange() {
        random.nextInt(4);
    }
}
