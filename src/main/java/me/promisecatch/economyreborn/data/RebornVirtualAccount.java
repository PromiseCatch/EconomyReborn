package me.promisecatch.economyreborn.data;

import org.spongepowered.api.service.economy.account.VirtualAccount;

public class RebornVirtualAccount extends RebornAccount implements VirtualAccount {
    public RebornVirtualAccount(RebornAccount account) {
        super(account);
    }
}
