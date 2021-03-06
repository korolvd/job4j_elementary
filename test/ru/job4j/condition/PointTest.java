package ru.job4j.condition;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(2, 0.01));
    }

    @Test
    public void when22to32then1() {
        Point a = new Point(2, 2);
        Point b = new Point(3, 2);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(1, 0.01));
    }

    @Test
    public void when410to110then12() {
        Point a = new Point(4, 10);
        Point b = new Point(11, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(12.21, 0.01));
    }

    @Test
    public void when07to00then7() {
        Point a = new Point(0, 7);
        Point b = new Point(0, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(7, 0.01));
    }

    @Test
    public void when10to1520then2441() {
        Point a = new Point(1, 0);
        Point b = new Point(15, 20);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(24.41, 0.01));
    }

    @Test
    public void when3d000to222then346() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(3.46, 0.01));
    }

    @Test
    public void when3d123to456then519() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(5.19, 0.01));
    }

    @Test
    public void when3d333to333then0() {
        Point a = new Point(3, 3, 3);
        Point b = new Point(3, 3, 3);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(0, 0.01));
    }
}