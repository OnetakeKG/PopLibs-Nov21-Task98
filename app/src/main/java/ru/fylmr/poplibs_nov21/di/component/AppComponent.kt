package ru.fylmr.poplibs_nov21.di.component

import dagger.Component
import ru.fylmr.poplibs_nov21.di.modules.ContextModule
import ru.fylmr.poplibs_nov21.di.modules.DbModule
import ru.fylmr.poplibs_nov21.di.modules.NavigationModule
import ru.fylmr.poplibs_nov21.di.modules.NetworkModule
import ru.fylmr.poplibs_nov21.ui.main.MainActivity
import ru.fylmr.poplibs_nov21.ui.main.MainPresenter
import ru.fylmr.poplibs_nov21.ui.repos.ReposPresenter
import ru.fylmr.poplibs_nov21.ui.repos.ReposPresenterFactory
import ru.fylmr.poplibs_nov21.ui.users.UsersPresenter
import javax.inject.Singleton

@Component(
    modules = [
        ContextModule::class,
        NavigationModule::class,
        DbModule::class,
        NetworkModule::class,
    ]
)
@Singleton
interface AppComponent {

    fun userSubcomponent(): UserSubcomponent

    fun provideMainPresenter(): MainPresenter

    fun inject(mainActivity: MainActivity)

    fun inject(mainPresenter: MainPresenter)
}