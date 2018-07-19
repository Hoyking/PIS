package com.dreamteamrss.pis.story1.task1;

import java.util.Arrays;

public class NumberTheoryImpl implements NumberTheory {
    @Override
    public int[] sort(int[] inputSequence) {
        int length = inputSequence.length;
        int[] outputSequence = new int[length];
        System.arraycopy(inputSequence, 0, outputSequence, 0, length);
        if (length <= 1) {
            return outputSequence;
        }
        for (int index1 = 0; index1 < length - 1; index1++) {
            for (int index2 = 0; index2 < length - index1 - 1; index2++) {
                int current = outputSequence[index2];
                int next = outputSequence[index2 + 1];
                if (!compareModules(current, next)) {
                    outputSequence[index2] = next;
                    outputSequence[index2 + 1] = current;
                }
            }
        }
        return outputSequence;
    }

    @Override
    public int[] createDiverseSequence(int[] inputSequence) {
        int length = inputSequence.length;
        int trueLength = 0;
        int[] outputSequence = new int[length];
        for (int item : inputSequence) {
            /*if (item < 10 && item > -10) {
                outputSequence[trueLength] = item;
                trueLength++;
                continue;
            }*/
            boolean check = true;
            int[] numArray = toNumArray(item);
            Arrays.sort(numArray);
            for (int index2 = 0; index2 < numArray.length - 1; index2++) {
                if (numArray[index2] == numArray[index2 + 1]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                outputSequence[trueLength] = item;
                trueLength++;
            }
        }
        int[] realOutput = new int[trueLength];
        System.arraycopy(outputSequence, 0, realOutput, 0, trueLength);
        return realOutput;
    }

    private int[] toNumArray(int number) {
        number = Math.abs(number);
        int tempNumber = number;
        int size = 0;
        while (tempNumber > 0) {
            size++;
            tempNumber /=10;
        }
        int[] resultArray = new int[size];
        int index = 0;
        while (number > 0) {
            resultArray[index] = number % 10;
            number /= 10;
            index++;
        }
        return resultArray;
    }

    private boolean compareModules(int item1, int item2) {
        return Math.abs(item1) >= Math.abs(item2);
    }
}
