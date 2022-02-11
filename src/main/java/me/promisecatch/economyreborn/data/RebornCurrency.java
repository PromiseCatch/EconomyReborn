package me.promisecatch.economyreborn.data;

import org.spongepowered.api.service.economy.Currency;
import org.spongepowered.api.text.Text;

import java.math.BigDecimal;

public class RebornCurrency implements Currency {

    @Override
    public Text getDisplayName() {
        return null;
    }

    @Override
    public Text getPluralDisplayName() {
        return null;
    }

    @Override
    public Text getSymbol() {
        return null;
    }

    @Override
    public Text format(BigDecimal amount, int numFractionDigits) {
        return null;
    }

    @Override
    public int getDefaultFractionDigits() {
        return 0;
    }

    @Override
    public boolean isDefault() {
        return false;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
