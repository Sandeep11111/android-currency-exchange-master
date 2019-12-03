package com.sandeep.currencyexchange.model.remote

import com.sandeep.currencyexchange.model.model.CurrencyExchangeRatesModel
import io.reactivex.Single
import java.util.*

interface CurrencyExchangeRatesRemoteService {

    fun getExchangeRatesForBase(baseCurrency: Currency): Single<CurrencyExchangeRatesModel>
}