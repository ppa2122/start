package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by pwilkin on 21.10.2021.
 */
public class GamePlayer {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("Witaj, graczu! Podaj nazwę gracza komputerowego, z " +
            "którym chcesz zagrać: ");
        String player = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("Wybrałeś gracza " + player);
        final String packageName = GamePlayer.class.getPackageName();
        final String className = player.contains(".") ? player : (packageName + "." + player);
        Class<?> clz = Class.forName(className);
        if (!Opponent.class.isAssignableFrom(clz)) {
            throw new RuntimeException("The class " + clz.getName() + " does not represent" +
                " a valid opponent player");
        }
        Opponent opponent = (Opponent) clz.getDeclaredConstructor().newInstance();
        System.out.println("Przeciwnik o sile " + opponent.getStrength());
        opponent.play();
    }

}
