package com.sandeep.currencyexchange.di

import com.sandeep.currencyexchange.config.CurrencyExchangeApplicationConfiguration
import com.sandeep.currencyexchange.model.local.UserCurrencySelectionLocalService
import com.sandeep.currencyexchange.model.remote.CurrencyExchangeRatesRemoteService
import com.sandeep.currencyexchange.model.repository.CurrencyExchangeRatesRepository
import com.sandeep.currencyexchange.model.repository.DualCurrencyExchangeRatesRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun providesCurrencyExchangeRatesRepository(localServiceUser: UserCurrencySelectionLocalService,
                                                remoteService: CurrencyExchangeRatesRemoteService,
                                                applicationConfiguration: CurrencyExchangeApplicationConfiguration
    ): CurrencyExchangeRatesRepository =
        DualCurrencyExchangeRatesRepository(localServiceUser,remoteService, applicationConfiguration)
}