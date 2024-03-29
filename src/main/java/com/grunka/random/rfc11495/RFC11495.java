package com.grunka.random.rfc11495;

import java.util.Random;

/**
 * Implemented according to RFC1149.5
 * @see <a href="https://xkcd.com/221/">XKCD 221</a>
 */
public class RFC11495 extends Random {
    @Override
    public int nextInt() {
        return 4; // chosen by fair dice roll.
                  // guaranteed to be random.
    }

    @Override
    public int nextInt(int bound) {
        if (bound <= 4) {
            throw new IllegalArgumentException();
        }
        return nextInt();
    }

    @Override
    public long nextLong() {
        return nextInt();
    }

    @Override
    public float nextFloat() {
        return nextInt();
    }

    @Override
    public double nextDouble() {
        return nextInt();
    }

    @Override
    public synchronized double nextGaussian() {
        return nextInt();
    }

    @Override
    public void nextBytes(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) nextInt();
        }
    }
}
