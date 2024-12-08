package ru.netology.HW_COLLECTIONS;

import java.util.HashMap;

public class Game {
    HashMap<String, Player> playersMap = new HashMap();

    public void register(Player player) {
        playersMap.put(player.getName(), player);
    }

private Player findPlayer(String  playerName) {
        Player player = playersMap.get(playerName);
        if (player == null) {
            throw new NotRegisteredException(playerName);
        }
        return player;
}

    public int round(String PlayerName1, String PlayerName2) {
        Player player1 = findPlayer(PlayerName1);
        Player player2 = findPlayer(PlayerName2);

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        } else if (player1.getStrength() < player2.getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }
}