package com.league.model;

public class Player {

    // TODO Task 2: Apply access modifiers
    public String name;              // public: accessible everywhere
    private int jerseyNumber;        // private: only in this class
    protected String position;       // protected: accessible in same package or subclasses

    // TODO Task 6: Add static variable to track number of players
    static int totalPlayers = 0;

    // TODO Task 3: Default constructor
    public Player() {
        this.name = "Unknown";
        this.jerseyNumber = 0;
        this.position = "Unassigned";
        totalPlayers++;
    }

    // TODO Task 3: Parameterized constructor with 'this'
    public Player(String name, int jerseyNumber, String position) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        totalPlayers++;
    }

    // TODO Task 5: Getter for private variable (jerseyNumber)
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    // TODO Task 4: Method Overloading
    public void printStats() {
        System.out.println("Name: " + name + ", Jersey: " + jerseyNumber);
    }

    public void printStats(boolean showPosition) {
        if (showPosition) {
            System.out.println("Name: " + name + ", Jersey: " + jerseyNumber + ", Position: " + position);
        } else {
            printStats();
        }
    }

    // TODO Task 6: Static method to print total number of players
    public static void printTotalPlayers() {
        System.out.println("Total players: " + totalPlayers);
    }

    // TODO Task 7: Override finalize() to print cleanup message
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being removed from memory.");
    }
}

