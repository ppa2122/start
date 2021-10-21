package sample;

/**
 * Created by pwilkin on 21.10.2021.
 */
public class Intermediate implements Opponent {
    @Override
    public void play() {
        System.out.println("You are playing an intermediate player, watch out!");
    }

    @Override
    public int getStrength() {
        return 1200;
    }
}
