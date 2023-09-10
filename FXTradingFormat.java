package com.FXTrading.services;

import java.util.List;

import com.FXTrading.model.FXTradingEntity;

public interface FXTradingFormat {

    /**
     * Performs a trade.
     *
     * @param fxTradingEntity The FX trading entity.
     * @return The result of the trade.
     */
    Object doTrade(FXTradingEntity fxTradingEntity);

    /**
     * Gets the list of trades.
     *
     * @return The list of trades.
     */
    List<FXTradingEntity> getTradeList();
}
