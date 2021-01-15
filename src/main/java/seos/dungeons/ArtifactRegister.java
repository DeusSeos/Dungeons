package seos.dungeons;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ArtifactRegister implements Listener {

    @EventHandler
    //This is for handing when we rename the item to an artifact
    public void anvilRename(PrepareAnvilEvent e) {
        AnvilInventory inv = e.getInventory();

        if (hasResult(e)) {
            if (isArtifact(inv) && isAlone(inv)) {
                Bukkit.broadcastMessage("Hi I'm an artifact!");
                //an item is being converted to artifact
                changeToArtifact(e);
            }
        }
    }

    //test to see if item is being combined or not
    public boolean isAlone(AnvilInventory inventory) {
        return inventory.getContents()[1] == null;
    }

    public boolean hasResult(PrepareAnvilEvent e) {
        return e.getResult() != null;
    }


    //test to see if the item is already an artifact
    public boolean isArtifact(AnvilInventory inventory) {
        //Bukkit.broadcastMessage(inventory.getRenameText());

        return (inventory.getRenameText().equalsIgnoreCase("broadsword"));
    }

    public void changeToArtifact(PrepareAnvilEvent e) {
        ItemStack item = e.getResult().clone();

        if (!item.getType().isAir()) {
            ItemMeta meta = item.getItemMeta();
            List<String> newlore = new ArrayList<>();
            newlore.add("Hi");
            meta.setLore(newlore);
            meta.setUnbreakable(true);
            meta.setDisplayName(ChatColor.GOLD + e.getInventory().getRenameText());
            item.setItemMeta(meta);
            e.setResult(item);
        }
    }

    //test to see if the item is damaged or not
    public boolean isDamaged(ItemStack item) {
        if (item.hasItemMeta()) {
            Damageable meta = (Damageable) item.getItemMeta();
            int damage = meta.getDamage();
            return damage != 0;
        }
        return false;
    }


    //repairs item on left
    public void repair(ItemStack itemStack) {
        Damageable meta = (Damageable) itemStack.getItemMeta();
        meta.setDamage(0);
        itemStack.setItemMeta((ItemMeta) meta);
    }


}
