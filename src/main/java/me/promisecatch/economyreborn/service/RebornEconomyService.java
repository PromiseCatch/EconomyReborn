package me.promisecatch.economyreborn.service;

import org.spongepowered.api.service.context.ContextCalculator;
import org.spongepowered.api.service.economy.Currency;
import org.spongepowered.api.service.economy.EconomyService;
import org.spongepowered.api.service.economy.account.Account;
import org.spongepowered.api.service.economy.account.AccountDeletionResultType;
import org.spongepowered.api.service.economy.account.UniqueAccount;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class RebornEconomyService implements EconomyService {

    @Override
    public Currency getDefaultCurrency() {
        return null;
    }

    @Override
    public Set<Currency> getCurrencies() {
        return null;
    }

    @Override
    public boolean hasAccount(UUID uuid) {
        return false;
    }

    @Override
    public boolean hasAccount(String identifier) {
        return false;
    }

    @Override
    public Optional<UniqueAccount> getOrCreateAccount(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> getOrCreateAccount(String identifier) {
        return Optional.empty();
    }

    @Override
    public AccountDeletionResultType deleteAccount(UUID uuid) {
        return EconomyService.super.deleteAccount(uuid);
    }

    @Override
    public AccountDeletionResultType deleteAccount(String identifier) {
        return EconomyService.super.deleteAccount(identifier);
    }

    @Override
    public void registerContextCalculator(ContextCalculator<Account> calculator) {

    }
}
