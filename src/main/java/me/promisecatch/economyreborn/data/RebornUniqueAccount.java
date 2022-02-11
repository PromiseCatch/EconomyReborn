package me.promisecatch.economyreborn.data;

import org.spongepowered.api.service.economy.account.UniqueAccount;

import java.util.UUID;

public class RebornUniqueAccount extends RebornAccount implements UniqueAccount {

    public RebornUniqueAccount(RebornAccount account) {
        super(account);
    }

    @Override
    public UUID getUniqueId() {
        return null;
    }
}
