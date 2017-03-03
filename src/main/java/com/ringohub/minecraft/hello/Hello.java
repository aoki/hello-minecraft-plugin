package com.ringohub.minecraft.hello;

import org.bukkit.plugin.java.JavaPlugin;

public final class Hello extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World!!");
//        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        System.out.println("Good Bye World!!");
        // Plugin shutdown logic
    }
}
