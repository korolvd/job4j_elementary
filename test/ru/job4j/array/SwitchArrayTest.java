package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 2, 4, 3};
        int[] rsl = SwitchArray.swap(input, 2, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap4to5() {
        int[] input = {1, 2, 3, 4, 7, 6};
        int[] expect = {1, 2, 3, 4, 6, 7};
        int[] rsl = SwitchArray.swap(input, 4, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0to2() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {3, 2, 1, 4};
        int[] rsl = SwitchArray.swap(input, 0, 2);
        assertThat(rsl, is(expect));
    }
}