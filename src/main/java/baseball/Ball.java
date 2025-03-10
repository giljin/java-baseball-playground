package baseball;

import java.util.*;

public class Ball {

    private final int position;
    private final int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)){
            return BallStatus.STRIKE;
        }

        if(this.matchBallNumber(ball.number)){
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    public boolean matchBallNumber(int number){
        return this.number == number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }

}
