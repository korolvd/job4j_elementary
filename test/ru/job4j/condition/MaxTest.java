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

    @Test
    public void whenMax1To6To9Then9() {
        int result = Max.max(1, 6, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax8To8To8Then8() {
        int result = Max.max(8, 8, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax6To3To2To18Then18() {
        int result = Max.max(6, 3, 2, 18);
        assertThat(result, is(18));
    }

    @Test
    public void whenMax3To3To3To3Then3() {
        int result = Max.max(3, 3, 3, 3);
        assertThat(result, is(3));
    }
}