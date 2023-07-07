package com.halebradley.prisonskills.Listeners;

import com.halebradley.prisonskills.Utils.Alerts;
import com.halebradley.prisonskills.Utils.Skill;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class Guard implements Listener {

    private Skill guardSkillPlugin;

    public Guard(Skill combatSkillPlugin) {
        this.guardSkillPlugin = combatSkillPlugin;
    }

    //TODO Custom event for guard skill
    @EventHandler


    public void increaseXP(int XP, Player p){
        if (guardSkillPlugin.addXP(XP, p) != -1) {
            Alerts.playerLevelUp(p, guardSkillPlugin);
        } else {
            Alerts.playerXPGained(p, guardSkillPlugin);
        }
    }
}
