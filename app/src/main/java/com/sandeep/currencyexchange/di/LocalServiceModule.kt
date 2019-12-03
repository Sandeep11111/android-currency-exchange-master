package com.sandeep.currencyexchange.di

import android.app.Application
import com.sandeep.currencyexchange.model.local.RoomUserCurrencySelectionDatabase
import com.sandeep.currencyexchange.model.local.RoomUserCurrencySelectionLocalService
import com.sandeep.currencyexchange.model.local.UserCurrencySelectionLocalService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalServiceModule {

    @Singleton
    @Provides
    fun providesCurrencyExchangeRateLocalService(roomUserCurrencySelectionDatabase: RoomUserCurrencySelectionDatabase): UserCurrencySelectionLocalService =
        RoomUserCurrencySelectionLocalService(roomUserCurrencySelectionDatabase)

    @Singleton
    @Provides
    fun providesRoomCurrencyExchangeRatesDatabase(application: Application): RoomUserCurrencySelectionDatabase =
        RoomUserCurrencySelectionDatabase.getInstance(application)
}