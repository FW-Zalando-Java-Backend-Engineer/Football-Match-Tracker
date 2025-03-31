package com.league.logic;

import com.league.model.Player;

public class AccessTest {
    public static void main(String[] args) {
        // TODO Task 2: Test access to different modifiers

        Player player = new Player("Alisson Becker", 1, "Goalkeeper");

        // ✅ public - accessible
        System.out.println("Name (public): " + player.name);

        // ❌ private - not accessible directly
        // System.out.println("Jersey (private): " + player.jerseyNumber); // Error

        // ✅ use getter
        System.out.println("Jersey (via getter): " + player.getJerseyNumber());

        // ❌ protected - not accessible from different package without inheritance
        // System.out.println("Position (protected): " + player.position); // Error
    }
}

