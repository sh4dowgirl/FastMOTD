package net.elytrium.fastmotd.integration;

import com.imaginarycode.minecraft.redisbungee.RedisBungeeAPI;

public class RedisBungeeIntegration {
    public static int getPlayerCount() {
        return RedisBungeeAPI.getRedisBungeeApi().getPlayerCount();
    }
}
