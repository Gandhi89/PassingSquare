package com.example.shivamgandhi.bouncingball.Utils;

public class Vars {
    private static Vars singleton = new Vars();

    private Vars() {
    }

    public static Vars getInstance() {
        return singleton;
    }
    // ----------------------------------------------- //

    private String networkID = "";
    private String playerName = "";
    private String ID = "";

    // ----------------------------------------------- //
    public String getNetworkID() {
        return networkID;
    }

    public void setNetworkID(String networkID) {
        this.networkID = networkID;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
