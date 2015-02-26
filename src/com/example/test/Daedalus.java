package com.example.test;

/**
 *
 * @author wangl
 */
public class Daedalus {

    public int calculateMaxYield(int[] strip) {
        for (int i : strip) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
        this.maxYield(strip, 0);
        int yield = 0;
        for (int i : strip) {
            System.out.print(i);
            System.out.print("\t");
            yield += i;
        }
        return yield;
    }

    private void maxYield(int[] strip, int index) {
        if (strip.length == 0) {
            return;
        }
        if (strip.length == 1) {
            return;
        }
        if (strip.length == index + 2) {
            if (strip[index] < strip[index + 1]) {
                strip[index] = 0;
            } else {
                strip[index + 1] = 0;
            }
        } else if (strip.length == index + 3) {
            if (strip[index] + strip[index + 2] < strip[index + 1]) {
                strip[index] = 0;
                strip[index + 2] = 0;
            } else {
                strip[index + 1] = 0;
            }
        } else {
            if (strip[index] + strip[index + 2] < strip[index + 1] + strip[index + 1]) {
                strip[index] = 0;
                strip[index + 2] = 0;
                this.maxYield(strip, index + 3);
            } else {
                strip[index + 1] = 0;
                this.maxYield(strip, index + 2);
            }
        }
    }

    public static void main(String[] args) {
        Daedalus daedalus = new Daedalus();
        int[] strip1 = new int[]{206, 140, 300, 52, 107};
        int yield1 = daedalus.calculateMaxYield(strip1);
        System.out.println("yield: " + yield1);
        System.out.println();

        int[] strip2 = new int[]{147, 206, 52, 240, 300};
        int yield2 = daedalus.calculateMaxYield(strip2);
        System.out.println("yield: " + yield2);
    }
}
