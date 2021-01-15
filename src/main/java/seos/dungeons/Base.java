package seos.dungeons;

import com.google.common.collect.Maps;
import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;
import org.bukkit.Material;

import java.util.Map;

public enum Base {
    AXE,
    BATTLESTAFF,
    CLAYMORE,
    CUTLASS,
    DAGGERS,
    GLAIVE,
    GREAT_HAMMER,
    HAMMER,
    MACE,
    PICKAXE,
    SICKLES,
    SOUL_KNIFE,
    SWORD,
    TEMPEST_KNIFE,
    WHIP,
    GAUNTLETS,
    SCYTHE,
    DOUBLE_AXE,
    KATANA,
    SPEAR,
    RAPIER;

    private static final Map<String, Base> BY_NAME = Maps.newHashMap();

    public static Base getBase(String name){
        Validate.notNull(name, "Name cannot be null.");
        return BY_NAME.get(name.toUpperCase());
    }

    public Material getMaterial(){
        String materialName = "";
        switch(this) {
            case AXE:
            case GREAT_HAMMER:
            case HAMMER:
            case MACE:
            case DOUBLE_AXE:
                materialName = "IRON_AXE";
                break;
            case SOUL_KNIFE:
            case SWORD:
            case TEMPEST_KNIFE:
            case CLAYMORE:
            case CUTLASS:
            case KATANA:
            case DAGGERS:
                materialName = "IRON_SWORD";
                break;
            case PICKAXE:
                materialName = "IRON_PICKAXE";
                break;
            case SICKLES:
            case SCYTHE:
                materialName = "IRON_HOE";
                break;
            case WHIP:
            case BATTLESTAFF:
            case GAUNTLETS:
            case SPEAR:
            case RAPIER:
            case GLAIVE:
                materialName = "STICK";
                break;
        }
        return Material.getMaterial(materialName);
    }

    static {
        for (Base base : values()) {
            BY_NAME.put(base.name(), base);
        }
    }




}

