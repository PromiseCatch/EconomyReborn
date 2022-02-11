package me.promisecatch.economyreborn;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

@Plugin(
        id = "economyreborn",
        name = "EconomyReborn",
        description = "A cool economy plugin for Sponge",
        authors = {
                "Gabriel8579",
                "LoboMetalurgico"
        }
)
public class EconomyRebornPlugin {

    @Inject
    private Logger logger;

    @Inject
    private PluginContainer pluginContainer;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
