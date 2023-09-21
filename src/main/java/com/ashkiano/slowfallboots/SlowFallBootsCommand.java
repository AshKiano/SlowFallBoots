package com.ashkiano.slowfallboots;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.Arrays;

public class SlowFallBootsCommand implements CommandExecutor {
    public static String SLOW_FALL_BOOTS_LORE;

    public SlowFallBootsCommand() {
        SLOW_FALL_BOOTS_LORE = ChatColor.GRAY + "Enjoy each your fall!";
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by a player!");
            return true;
        }

        Player player = (Player) sender;

        String slowFallBootsName = "Slow fall boots";
        ItemStack slowFallBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta meta = (LeatherArmorMeta) slowFallBoots.getItemMeta();
        meta.setColor(Color.RED);
        meta.setLore(Arrays.asList(SLOW_FALL_BOOTS_LORE));
        meta.setDisplayName(slowFallBootsName);
        slowFallBoots.setItemMeta(meta);

        player.getInventory().addItem(slowFallBoots);

        return true;
    }
}
