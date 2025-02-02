package com.example.quoteplus.core.di
import android.app.Application
import android.content.Context
import com.example.quoteplus.QuotesApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ContextApplication {
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): QuotesApp {
        return app as QuotesApp
    }
}