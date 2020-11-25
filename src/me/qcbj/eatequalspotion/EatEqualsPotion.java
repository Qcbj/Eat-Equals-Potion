package me.qcbj.eatequalspotion;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EatEqualsPotion extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this); // Registers events
    }

    // Random rand = new Random();

    @EventHandler
    public void onEat(PlayerItemConsumeEvent event) {


        // Player player = event.getPlayer();

        int rnd = ThreadLocalRandom.current().nextInt(PotionEffectType.values().length);
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.values()[rnd], 200, 1));
    }

}
