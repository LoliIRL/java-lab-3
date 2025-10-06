package main.java.primes;

import java.util.Iterator;

public class PrimesGenerator implements Iterable<Integer> {
    private final int count;

    public PrimesGenerator(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrimesIterator();
    }

    private class PrimesIterator implements Iterator<Integer> {
        private int generated = 0;
        private int current = 2;

        @Override
        public boolean hasNext() {
            return generated < count;
        }

        @Override
        public Integer next() {
            while (!isPrime(current)) {
                current++;
            }
            int prime = current;
            current++;
            generated++;
            return prime;
        }

        private boolean isPrime(int n) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}