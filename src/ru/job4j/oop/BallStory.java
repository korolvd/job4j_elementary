package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare hare = new Hare();
        hare.tryEat(ball);
        ball.escape(hare);
        wolf.tryEat(ball);
        ball.escape(wolf);
        fox.tryEat(ball);
    }
}
