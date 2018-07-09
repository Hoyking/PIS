package com.dreamteamrss.pis.story1.task1;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Story1Task1Test {

    private static NumberTheory numberTheory;

    @BeforeClass
    public static void before() {
        numberTheory = new NumberTheoryImpl();
    }

    @Test
    public void sortTest() {
        int[] inputSequence = {0, -5, 10, -7, 6};
        int[] outputSequence = numberTheory.sort(inputSequence);
        assertTrue(Arrays.equals(outputSequence, new int[]{10, -7, 6, -5, 0}));
    }

}
