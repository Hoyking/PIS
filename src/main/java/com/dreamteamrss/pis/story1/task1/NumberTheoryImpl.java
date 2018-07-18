package com.dreamteamrss.pis.story1.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
    public List<Integer> createDiverseSequenceMethod1(List<Integer> inputSequence) {
        List<Integer> outputSequence = new ArrayList<>(inputSequence.size());
        for (Integer item : inputSequence) {
            if (item < 10 && item > -10) {
                outputSequence.add(item);
                continue;
            }
            char[] chars = item.toString().toCharArray();
            Arrays.sort(chars);
            boolean check = true;
            for (int index = 0; index < chars.length - 1; index++) {
                if (chars[index] == chars[index + 1]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                outputSequence.add(item);
            }
        }
        return outputSequence;
    }

    @Override
    public List<Integer> createDiverseSequenceMethod2(List<Integer> inputSequence) {
        List<Integer> outputSequence = new ArrayList<>(inputSequence.size());
        for (Integer item : inputSequence) {
            if (item < 10 && item > -10) {
                outputSequence.add(item);
                continue;
            }
            boolean check = true;
            Integer[] numArray = toNumArrayMethod1(item);
            Arrays.sort(numArray);
            for (int index = 0; index < numArray.length - 1; index++) {
                if (numArray[index].equals(numArray[index + 1])) {
                    check = false;
                    break;
                }
            }
            if (check) {
                outputSequence.add(item);
            }
        }
        return outputSequence;
    }

    @Override
    public List<Integer> createDiverseSequenceMethod3(List<Integer> inputSequence) {
        List<Integer> outputSequence = new ArrayList<>(inputSequence.size());
        for (Integer item : inputSequence) {
            if (item < 10 && item > -10) {
                outputSequence.add(item);
                continue;
            }
            boolean check = true;
            int[] numArray = toNumArrayMethod2(item);
            Arrays.sort(numArray);
            for (int index = 0; index < numArray.length - 1; index++) {
                if (numArray[index] == numArray[index + 1]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                outputSequence.add(item);
            }
        }
        return outputSequence;
    }

    @Override
    public List<Integer> createDiverseSequenceMethod4(int[] inputSequence) {
        List<Integer> outputSequence = new ArrayList<>(inputSequence.length);
        for (int item : inputSequence) {
            if (item < 10 && item > -10) {
                outputSequence.add(item);
                continue;
            }
            boolean check = true;
            int[] numArray = toNumArrayMethod2(item);
            Arrays.sort(numArray);
            for (int index = 0; index < numArray.length - 1; index++) {
                if (numArray[index] == numArray[index + 1]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                outputSequence.add(item);
            }
        }
        return outputSequence;
    }

    private Integer[] toNumArrayMethod1(int number) {
        List<Integer> numberList = new ArrayList<>(10);
        number = Math.abs(number);
        while (number > 0) {
            numberList.add(number % 10);
            number /= 10;
        }
        Integer[] resultArray = new Integer[numberList.size()];
        return numberList.toArray(resultArray);
    }

    private int[] toNumArrayMethod2(int number) {
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
