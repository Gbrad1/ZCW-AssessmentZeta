package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer[] buffer = new Integer[ints.length];
        int index = 0;
        int outdex = 0;
        while (index < ints.length) {
            if (ints[index] % 2 == 1) {
                buffer[outdex] = ints[index];
                index++;
                outdex++;
            } else {
                index++;
            }
        }
        return Arrays.copyOfRange(buffer, 0, outdex);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] buffer = new Integer[ints.length];
        int index = 0;
        int outdex = 0;
        while (index < ints.length) {
            if (ints[index] % 2 == 0) {
                buffer[outdex] = ints[index];
                index++;
                outdex++;
            } else {
                index++;
            }
        }
        return Arrays.copyOfRange(buffer, 0, outdex);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] buffer = new Integer[ints.length];
        int index = 0;
        int outdex = 0;
        while (index < ints.length) {
            if (ints[index] % 3 == 1) {
                buffer[outdex] = ints[index];
                index++;
                outdex++;
            } else {
                index++;
            }
        }
        return Arrays.copyOfRange(buffer, 0, outdex);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer[] buffer = new Integer[ints.length];
        int index = 0;
        int outdex = 0;
        while (index < ints.length) {
            if (ints[index] % multiple == 0) {
                index++;
            } else {
                buffer[outdex] = ints[index];
                index++;
                outdex++;
            }
        }
        return Arrays.copyOfRange(buffer, 0, outdex);
    }
}
