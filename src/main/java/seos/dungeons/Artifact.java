package seos.dungeons;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Artifact {

    private String name;
    private Base base;
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

    public Material toMaterial(){
        String materialName = "";
        switch(base) {
            case AXE:
                break;
            case BATTLESTAFF:
                break;
            case CLAYMORE:
                break;
            case CUTLASS:
                break;
            case DAGGERS:
                break;
            case GLAIVE:
                break;
            case GREAT_HAMMER:
                break;
            case HAMMER:
                break;
            case MACE:
                break;
            case PICKAXE:
                break;
            case SICKLES:
                break;
            case SOUL_KNIFE:
                break;
            case SWORD:
                break;
            case TEMPEST_KNIFE:
                break;
            case WHIP:
                break;
            case GAUNTLETS:
                break;
            case SCYTHE:
                break;
            case DOUBLE_AXE:
                break;
            case KATANA:
                break;
            case SPEAR:
                break;
            case RAPIER:
                break;
        }
        return Material.getMaterial(materialName);
    }

    public ItemStack toItem(){
        ItemStack artifactItem = new ItemStack(Material.IRON_AXE);
        ItemMeta itemMeta = artifactItem.getItemMeta();
        itemMeta.setDisplayName(name);


        itemMeta.setUnbreakable(true);

        return artifactItem;
    }





}
