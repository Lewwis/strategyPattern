package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.AmericanFootballBall;
import mx.iteso.strategy.balls.BaseballBall;
import mx.iteso.strategy.balls.BasketballBall;
import mx.iteso.strategy.balls.GolfBall;
import mx.iteso.strategy.balls.HandballBall;
import mx.iteso.strategy.balls.PullBall;
import mx.iteso.strategy.balls.SoccerBall;
import mx.iteso.strategy.balls.TennisBall;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball basket = new BasketballBall();
        Ball golf = new GolfBall();
        Ball hand = new HandballBall();
        Ball pull = new PullBall();
        Ball tennis = new TennisBall();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.form());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.form());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.form());
        
        System.out.println();

        System.out.println(basket.roll());
        System.out.println(basket.performBounce());
        System.out.println(basket.performDeflate());
        System.out.println(basket.performInflate());
        System.out.println(basket.form());
        
        System.out.println();

        System.out.println(golf.roll());
        System.out.println(golf.performBounce());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());
        System.out.println(golf.form());
        
        System.out.println();

        System.out.println(hand.roll());
        System.out.println(hand.performBounce());
        System.out.println(hand.performDeflate());
        System.out.println(hand.performInflate());
        System.out.println(hand.form());
        
        System.out.println();

        System.out.println(pull.roll());
        System.out.println(pull.performBounce());
        System.out.println(pull.performDeflate());
        System.out.println(pull.performInflate());
        System.out.println(pull.form());
        
        System.out.println();

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(tennis.form());

    }
}
