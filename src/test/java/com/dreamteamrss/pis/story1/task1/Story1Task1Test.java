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
    public void diverseSequenceMethod1Test() {
        for (int index = 0; index < 1000000; index++) {
            List<Integer> inputSequence = Arrays.asList(13584, 657498, 1357498564, 486512348, -789, 24783365, 798456123);
            List<Integer> outputSequence = numberTheory.createDiverseSequenceMethod1(inputSequence);
            assertEquals(Arrays.asList(13584, 657498, -789, 798456123), outputSequence);
        }
    }

    @Test
    public void diverseSequenceMethod2Test() {
        for (int index = 0; index < 1000000; index++) {
            List<Integer> inputSequence = Arrays.asList(13584, 657498, 1357498564, 486512348, -789, 24783365, 798456123);
            List<Integer> outputSequence = numberTheory.createDiverseSequenceMethod2(inputSequence);
            assertEquals(Arrays.asList(13584, 657498, -789, 798456123), outputSequence);
        }
    }

    @Test
    public void diverseSequenceMethod3Test() {
        for (int index = 0; index < 1000000; index++) {
            List<Integer> inputSequence = Arrays.asList(13584, 657498, 1357498564, 486512348, -789, 24783365, 798456123);
            List<Integer> outputSequence = numberTheory.createDiverseSequenceMethod3(inputSequence);
            assertEquals(Arrays.asList(13584, 657498, -789, 798456123), outputSequence);
        }
    }

    @Test
    public void diverseSequenceMethod4Test() {
        for (int index = 0; index < 1000000; index++) {
            int[] inputSequence = {13584, 657498, 1357498564, 486512348, -789, 24783365, 798456123};
            List<Integer> outputSequence = numberTheory.createDiverseSequenceMethod4(inputSequence);
            assertEquals(Arrays.asList(13584, 657498, -789, 798456123), outputSequence);
        }
    }
}
