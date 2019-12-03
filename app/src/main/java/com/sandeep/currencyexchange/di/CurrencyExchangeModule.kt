package com.sandeep.currencyexchange.di

import com.sandeep.currencyexchange.config.CurrencyExchangeApplicationConfiguration
import com.sandeep.currencyexchange.domain.ObserveUserCurrencyExchangeRatesListChangesUseCase
import com.sandeep.currencyexchange.domain.UpdateBaseCurrencyUseCase
import com.sandeep.currencyexchange.domain.UpdateCurrencyAmountUseCase
import com.sandeep.currencyexchange.model.repository.CurrencyExchangeRatesRepository
import dagger.Module
import dagger.Provides
import java.math.MathContext
import javax.inject.Singleton

@Module
class CurrencyExchangeModule {

    @Singleton
    @Provides
    fun providesObserveUserCurrencyExchangeRatesListUseCase(
        repository: CurrencyExchangeRatesRepository,
        configuration: CurrencyExchangeApplicationConfiguration,
        mathContext: MathContext): ObserveUserCurrencyExchangeRatesListChangesUseCase
            = ObserveUserCurrencyExchangeRatesListChangesUseCase(repository, configuration, mathContext)

    @Singleton
    @Provides
    fun providesChangeCurrencyAmountUseCase(repository: CurrencyExchangeRatesRepository): UpdateCurrencyAmountUseCase
            = UpdateCurrencyAmountUseCase(repository)

    @Singleton
    @Provides
    fun providesChangeBaseCurrencyUseCase(repository: CurrencyExchangeRatesRepository): UpdateBaseCurrencyUseCase
            = UpdateBaseCurrencyUseCase(repository)

    @Singleton
    @Provides
    fun providesMathContext(configuration: CurrencyExchangeApplicationConfiguration): MathContext
            = MathContext(configuration.mathCalculationPrecision, configuration.mathCalculationRoundingMode)
}