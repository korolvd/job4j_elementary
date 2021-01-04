package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchWeekTest {
    @Test
    public void whenSunday() {
        assertThat(
                SwitchWeek.nameOfDay(7),
                is("Воскресенье")
        );
    }
}