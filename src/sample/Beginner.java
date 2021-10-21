package sample;

/**
 * Created by pwilkin on 21.10.2021.
 */
public class Beginner implements Opponent {
    @Override
    public void play() {
        System.out.println("You are playing a total beginner!");
    }

    @Override
    public int getStrength() {
        return 400;
    }
}
