package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax9To8Then9() {
        int result = Max.max(9, 8);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax15To20Then2() {
        int result = Max.max(15, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenMax6To6Then6() {
        int result = Max.max(6, 6);
        assertThat(result, is(6));
    }
}