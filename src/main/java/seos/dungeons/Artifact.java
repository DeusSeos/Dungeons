package seos.dungeons;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Artifact {

    private static String name;
    private static Base base;
    private boolean unique;

    //Artifact Class
    public Artifact(String name, Base base, boolean unique){
        this.name = name;
        this.base = base;
        this.unique = unique;
    }

    public String name() {
        return name;
    }

    public Base base(){
        return base;
    }

    public boolean unique(){
        return unique;
    }

    //Create new item from base material.
    public static ItemStack toItem(){
//        Bukkit.broadcastMessage(base.toString());
//        Bukkit.broadcastMessage("base material :" + base.getMaterial().toString());
        ItemStack artifactItem = new ItemStack(base.getMaterial());
        ItemMeta itemMeta = artifactItem.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GOLD + name);
        itemMeta.setUnbreakable(true);
        artifactItem.setItemMeta(itemMeta);
//        Bukkit.broadcastMessage(artifactItem.toString());
        return artifactItem;
    }





}
