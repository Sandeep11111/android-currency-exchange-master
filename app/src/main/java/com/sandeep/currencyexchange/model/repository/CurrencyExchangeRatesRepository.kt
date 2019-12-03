package com.sandeep.currencyexchange.model.repository

import com.sandeep.currencyexchange.model.model.CurrencyExchangeRatesModel
import com.sandeep.currencyexchange.model.model.UserCurrencySelectionModel
import io.reactivex.Completable
import io.reactivex.Flowable
import java.math.BigDecimal
import java.util.*

interface CurrencyExchangeRatesRepository {

    fun observeCurrencyExchangeRates(baseCurrency: Currency): Flowable<CurrencyExchangeRatesModel>

    fun observeUserCurrencySelection(): Flowable<UserCurrencySelectionModel>

    fun updateUserBaseCurrencySelection(newBaseCurrency: Currency): Completable

    fun updateUserCurrencyAmountSelection(newCurrencyAmount: BigDecimal): Completable
}