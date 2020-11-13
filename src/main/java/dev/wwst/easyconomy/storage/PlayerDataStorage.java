package dev.wwst.easyconomy.storage;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

/**
 * @author Weiiswurst
 */
public interface PlayerDataStorage extends Saveable {

    public double getPlayerData(@NotNull OfflinePlayer p);

    public double getPlayerData(@NotNull UUID player);

    public @NotNull List<UUID> getAllData();

    public void write(@NotNull UUID key, double value);

    public void reload();

    public @NotNull Map<UUID, Double> getBaltop();
    
    public boolean has(@NotNull UUID key);

}
