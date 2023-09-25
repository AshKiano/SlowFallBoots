package com.ashkiano.slowfallboots;

import org.bukkit.plugin.java.JavaPlugin;

public final class SlowFallBoots extends JavaPlugin {


    @Override
    public void onEnable() {
        getCommand("slowfallboots").setExecutor(new SlowFallBootsCommand());
        getServer().getPluginManager().registerEvents(new SlowFallBootsListener(this), this);
        Metrics metrics = new Metrics(this,19516);
        this.getLogger().info("Thank you for using the SlowFallBoots plugin! If you enjoy using this plugin, please consider making a donation to support the development. You can donate at: https://donate.ashkiano.com");
    }
}
