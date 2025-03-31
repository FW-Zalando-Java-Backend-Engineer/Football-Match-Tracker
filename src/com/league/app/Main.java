package com.league.app;

import com.league.model.Player;

public class Main {
    public static void main(String[] args) {

        // TODO Task 1: Create player objects using both constructors
        Player p1 = new Player("Erling Haaland", 9, "Striker");
        Player p2 = new Player();
        Player p3 = new Player("Virgil van Dijk", 4, "Defender");

        // TODO Task 4: Use method overloading to print stats
        p1.printStats();                     // basic info
        p3.printStats(true);                 // with position

        // TODO Task 6: Call static method
        Player.printTotalPlayers();

        // TODO Task 7: Set objects to null and call garbage collector
        p1 = null;
        p2 = null;
        p3 = null;

        System.gc(); // Suggest JVM to perform garbage collection

        try {
            Thread.sleep(1000); // Give GC some time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method ended.");
    }
}

