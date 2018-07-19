package com.dreamteamrss.pis.story1.task1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Story1Task1Test {
    private NumberTheory numberTheory;

    @Before
    public void before() {
        numberTheory = new NumberTheoryImpl();
    }

    @Test
    public void sortTest() {
        int[] inputSequence = {0, -5, 10, -7, 6};
        int[] outputSequence = numberTheory.sort(inputSequence);
        assertTrue(Arrays.equals(outputSequence, new int[]{10, -7, 6, -5, 0}));
    }

    @Test
    public void diverseSequenceTest() {
//        long time = System.currentTimeMillis();
        for (int index = 0; index < 1000000; index++) {
            int[] inputSequence = {13584, 657498, 1357498564, 486512348, -789, 24783365, 798456123};
            int[] outputSequence = numberTheory.createDiverseSequence(inputSequence);
            assertTrue(Arrays.equals(new int[] {13584, 657498, -789, 798456123}, outputSequence));
        }
//        System.out.println(System.currentTimeMillis() - time);
    }
}
