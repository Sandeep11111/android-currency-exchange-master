package com.sandeep.currencyexchange.di

import com.sandeep.currencyexchange.presentation.activity.CurrencyExchangeListActivity
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule : AndroidInjector<CurrencyExchangeListActivity> {

    @ContributesAndroidInjector
    fun contributeCurrencyExchangeListActivity(): CurrencyExchangeListActivity
}