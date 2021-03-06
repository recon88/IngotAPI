package com.ingotpowered.api;

import com.ingotpowered.api.events.EventFactory;

public abstract class Ingot {

    private static Ingot ingot;

    public static void setServer(Ingot instance) {
        if (ingot != null) {
            throw new RuntimeException("Server already exists!");
        }
        ingot = instance;
    }

    public static Ingot getServer() {
        return ingot;
    }

    public abstract void dispatchCommand(String command);

    public abstract Player getPlayer(String name);

    public abstract void stop();

    public abstract Config getConfig();

    public abstract EventFactory getEventFactory();
}
