package sample;

/**
 * Created by pwilkin on 21.10.2021.
 *
 * An interface representing an opponent in the game
 */
public interface Opponent {

    /**
     * Play a game using this class' implemented opponent
     */
    public void play();
    /**
     * Get a player's playing strength
     * @return number corresponding to the player's estimated ELO rating
     */
    public int getStrength();

}
