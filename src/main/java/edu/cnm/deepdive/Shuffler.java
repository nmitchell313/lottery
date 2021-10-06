package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class Shuffler {

    private final Random rng;

    public Shuffler(Random rng) {
        this.rng = rng;
    }

    // int []
    public void shuffle(int[] data) {
        shufflePart(data, data.length - 1);
    }

    public int[] shuffle(int[] data, int drawSize) {
        shufflePart(data, drawSize);
        return Arrays.copyOfRange(data, data.length - drawSize, data.length);
    }

    // double []
    public void shuffle(double[] data) {
        shufflePart(data, data.length - 1);
    }

    public double[] shuffle(double[] data, int drawSize) {
        shufflePart(data, drawSize);
        return Arrays.copyOfRange(data, data.length - drawSize, data.length);
    }

    // boolean []
    public void shuffle(boolean[] data) {
        shufflePart(data, data.length - 1);
    }

    public boolean[] shuffle(boolean[] data, int drawSize) {
        shufflePart(data, drawSize);
        return Arrays.copyOfRange(data, data.length - drawSize, data.length);
    }

    // byte []
    public void shuffle(byte[] data) {
        shufflePart(data, data.length - 1);
    }

    public byte[] shuffle(byte[] data, int drawSize) {
        shufflePart(data, drawSize);
        return Arrays.copyOfRange(data, data.length - drawSize, data.length);
    }

    //char []
    public void shuffle(char[] data) {
        shufflePart(data, data.length - 1);
    }

    public char[] shuffle(char[] data, int drawSize) {
        shufflePart(data, drawSize);
        return Arrays.copyOfRange(data, data.length - drawSize, data.length);
    }

    //short []
    public void shuffle(short[] data) {
        shufflePart(data, data.length - 1);
    }

    public short[] shuffle(short[] data, int drawSize) {
        shufflePart(data, drawSize);
        return Arrays.copyOfRange(data, data.length - drawSize, data.length);
    }

    // long []
    public void shuffle(long[] data) {
        shufflePart(data, data.length - 1);
    }

    public long[] shuffle(long[] data, int drawSize) {
        shufflePart(data, drawSize);
        return Arrays.copyOfRange(data, data.length - drawSize, data.length);
    }

    // float []
    public void shuffle(float[] data) {
        shufflePart(data, data.length - 1);
    }

    public float[] shuffle(float[] data, int drawSize) {
        shufflePart(data, drawSize);
        return Arrays.copyOfRange(data, data.length - drawSize, data.length);
    }

    // Object []
    public void shuffle(Object[] data) {
        shufflePart(data, data.length - 1);
    }

    public Object[] shuffle(Object[] data, int drawSize) {
        shufflePart(data, drawSize);
        return Arrays.copyOfRange(data, data.length - drawSize, data.length);
    }

    // int []
    private void shufflePart(int[] data, int drawSize) {
        for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
            int destIndex = rng.nextInt(sourceIndex + 1);
            if (sourceIndex != destIndex) {
                int temp = data[sourceIndex];
                data[sourceIndex] = data[destIndex];
                data[destIndex] = temp;
            }
        }
    }

    // double []
    private void shufflePart(double[] data, int drawSize) {
        for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
            int destIndex = rng.nextInt(sourceIndex + 1);
            if (sourceIndex != destIndex) {
                double temp = data[sourceIndex];
                data[sourceIndex] = data[destIndex];
                data[destIndex] = temp;
            }
        }
    }

    // boolean []
    private void shufflePart(boolean[] data, int drawSize) {
        for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
            int destIndex = rng.nextInt(sourceIndex + 1);
            if (sourceIndex != destIndex) {
                boolean temp = data[sourceIndex];
                data[sourceIndex] = data[destIndex];
                data[destIndex] = temp;
            }
        }
    }

    // byte []
    private void shufflePart(byte[] data, int drawSize) {
        for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
            int destIndex = rng.nextInt(sourceIndex + 1);
            if (sourceIndex != destIndex) {
                byte temp = data[sourceIndex];
                data[sourceIndex] = data[destIndex];
                data[destIndex] = temp;
            }
        }
    }

    // char []
    private void shufflePart(char[] data, int drawSize) {
        for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
            int destIndex = rng.nextInt(sourceIndex + 1);
            if (sourceIndex != destIndex) {
                char temp = data[sourceIndex];
                data[sourceIndex] = data[destIndex];
                data[destIndex] = temp;
            }
        }
    }

    // short []
    private void shufflePart(short[] data, int drawSize) {
        for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
            int destIndex = rng.nextInt(sourceIndex + 1);
            if (sourceIndex != destIndex) {
                short temp = data[sourceIndex];
                data[sourceIndex] = data[destIndex];
                data[destIndex] = temp;
            }
        }
    }

    // long []
    private void shufflePart(long[] data, int drawSize) {
        for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
            int destIndex = rng.nextInt(sourceIndex + 1);
            if (sourceIndex != destIndex) {
                long temp = data[sourceIndex];
                data[sourceIndex] = data[destIndex];
                data[destIndex] = temp;
            }
        }
    }

    // float []
    private void shufflePart(float[] data, int drawSize) {
        for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
            int destIndex = rng.nextInt(sourceIndex + 1);
            if (sourceIndex != destIndex) {
                float temp = data[sourceIndex];
                data[sourceIndex] = data[destIndex];
                data[destIndex] = temp;
            }
        }
    }

    // Object[]
    private void shufflePart(Object[] data, int drawSize) {
        for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
            int destIndex = rng.nextInt(sourceIndex + 1);
            if (sourceIndex != destIndex) {
                Object temp = data[sourceIndex];
                data[sourceIndex] = data[destIndex];
                data[destIndex] = temp;
            }
        }
    }
}
