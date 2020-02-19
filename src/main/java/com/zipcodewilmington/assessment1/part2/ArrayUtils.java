package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for (Object element : objectArray) {
            if (element.equals(objectToCount)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer[] newArray = new Integer[objectArray.length];
        int inputIndex = 0;
        int outputLength = 0;
        while (inputIndex < objectArray.length) {
            if (objectArray[inputIndex].equals(objectToRemove)) {
                inputIndex++;
            } else {
                newArray[outputLength] = (Integer)objectArray[inputIndex];
                inputIndex++;
                outputLength++;
            }
        }
        Object[] toRet = Arrays.copyOfRange(newArray, 0, outputLength);
        return toRet;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Arrays.sort(objectArray);
        int occ = 0;
        int count = 0;
        int mostPopular = 0;
        for (int i = 0; i < objectArray.length; i++) {
            occ = 0;
            for (int j = 0; j < objectArray.length; j++) {
                if (objectArray[i].equals(objectArray[j])) {
                    occ++;
                }
            }
            if (count < occ) {
                mostPopular = (int)objectArray[i];
                count = occ;
            }
        }
        System.out.println(count);
        return mostPopular;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Arrays.sort(objectArray);
        int occ = 0;
        int count = 0;
        int leastCommon = 0;
        for (int i = 0; i < objectArray.length; i++) {
            occ = 0;
            for (int j = 0; j < objectArray.length; j++) {
                if (objectArray[i].equals(objectArray[j])) {
                    occ++;
                }
            }
            if (count > occ || i == 0) {
                leastCommon = (int)objectArray[i];
                count = occ;
            }
        }
        System.out.println(count);
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] buffer = new Integer[objectArray.length + objectArrayToAdd.length];
        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            buffer[i] = (Integer)objectArray[i];
            count++;
        }

        for (int j = 0; j < objectArray.length; j++) {
            buffer[count] = (Integer)objectArrayToAdd[j];
            count++;
        }
        return buffer; //Arrays.copyOfRange(buffer, 0, buffer.length);
    }
}
