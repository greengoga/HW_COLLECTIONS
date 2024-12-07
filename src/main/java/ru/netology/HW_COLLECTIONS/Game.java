package ru.netology.HW_COLLECTIONS;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> playersList = new ArrayList<>();

    public void register(Player player) {
        playersList.add(player);
    }

    public int round(String PlayerName1, String PlayerName2) {
        Player player1 = null;
        Player player2 = null;
        for (Player player : playersList) {
            if (player.getName().equals(PlayerName1)) {
                player1 = player;
            } else if (player.getName().equals(PlayerName2)) {
                player2 = player;
            }
        }
        if (player1 == null) {
            throw new NotRegisteredException(PlayerName1);
        }
        if (player2 == null) {
            throw new NotRegisteredException(PlayerName2);
        }
        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        } else if (player1.getStrength() < player2.getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }
}