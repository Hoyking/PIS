package com.dreamteamrss.pis.story1.task1;

public class NumberTheoryImpl implements NumberTheory {
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

    private boolean compareModules(int item1, int item2) {
        return Math.abs(item1) >= Math.abs(item2);
    }
}
