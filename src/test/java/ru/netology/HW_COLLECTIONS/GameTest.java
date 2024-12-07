package ru.netology.HW_COLLECTIONS;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void shouldReturnOneWhenFirstWins() {
        Player player1 = new Player(1, "QQQ", 125);
        Player player2 = new Player(2, "DDD", 123);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("QQQ", "DDD");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTwoWhenSecondWins() {
        Player player1 = new Player(1, "QQQ", 123);
        Player player2 = new Player(2, "DDD", 125);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round("QQQ", "DDD");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnZeroWhenDraw() {
        Player player1 = new Player(1, "QQQ", 1);
        Player player2 = new Player(2, "DDD", 1);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round("QQQ", "DDD");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionIfFirstNotRegistered() {
        Player player2 = new Player(2, "DDD", 1);
        Game game = new Game();

        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("QQQ", "DDD")
        );
    }

    @Test
    public void shouldThrowExceptionIfSecondNotRegistered() {
        Player player1 = new Player(1, "QQQ", 1);
        Game game = new Game();

        game.register(player1);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("QQQ", "DDD")
        );
    }
}